package pe.bazan.luis.plugins.cs16mc.controllers;

import org.bukkit.World;
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
            if (game.getWorld().equals(world)) return game;
        }
        return null;
    }

    public static GameController getInstance() {
        if (instance == null) {
            instance = new GameController();
        }
        return instance;
    }
}
