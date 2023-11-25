package pe.bazan.luis.plugins.cs16mc.controllers;

import org.bukkit.World;
import org.bukkit.entity.Player;
import pe.bazan.luis.plugins.cs16mc.CS16MC;
import pe.bazan.luis.plugins.cs16mc.domain.PluginMap;
import pe.bazan.luis.plugins.cs16mc.domain.enums.MapType;
import pe.bazan.luis.plugins.cs16mc.game.Game;
import pe.bazan.luis.plugins.cs16mc.game.PlayerGame;

import javax.annotation.Nullable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class GameController {
    private static GameController instance;
    private final Map<String, PlayerGame> players;
    private final List<Game> games;

    private GameController() {
        players = new LinkedHashMap<>();
        games = new ArrayList<>();
    }

    public Map<String, PlayerGame> getPlayers() {
        return players;
    }

    @Nullable
    public PlayerGame getPlayerGame(String username) {
        return players.get(username);
    }

    @Nullable
    public Game getGame(String username) {
        if (getPlayerGame(username) != null) {
            return getPlayerGame(username).getGame();
        }
        return null;
    }

    @Nullable
    public Game getGame(World world) {
        for (Game game : games) {
            if (game.getPluginMap().getWorld().getCBWorld().equals(world)) return game;
        }
        return null;
    }

    @Nullable
    public Game getGameById(String gameId) {
        for (Game game : games) {
            if (game.getGameId().equalsIgnoreCase(gameId)) return game;
        }
        return null;
    }

    public List<Game> getGames() {
        return games;
    }

    public Game createGame(MapType mapType, int teamsAmount) {
        PluginMap pluginMap = WorldController.getInstance().getFreeMap(mapType);
        Game game = new Game(
                CS16MC.getInstance().getMapsConfig().getArena(mapType.name()),
                pluginMap,
                teamsAmount
        );

        pluginMap.setGame(game);

        games.add(game);
        return game;
    }

    public void stopGame(Game game) {
        for (PlayerGame playerGame : players.values()) {
            playerGame.getPlayer().teleport(CS16MC.getInstance().getPluginConfig().getLobby());
        }
        game.getPluginMap().setGame(null);
        games.remove(game);
    }

    public PlayerGame joinPlayer(Player player, Game game) {
        PlayerGame playerGame = new PlayerGame(player, game);
        players.put(player.getName(), playerGame);
        return playerGame;
    }

    public static GameController getInstance() {
        if (instance == null) {
            instance = new GameController();
        }
        return instance;
    }
}
