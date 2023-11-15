package pe.bazan.luis.plugins.cs16mc.game;

import org.bukkit.World;
import pe.bazan.luis.plugins.cs16mc.domain.configs.ArenaData;

public class Game {
    private GameState gameState;
    private final ArenaData arenaData;
    private final World world;
    private final GameTeam[] gameTeams;

    public Game(ArenaData arenaData, World world, int teamsAmount) {
        this.gameState = GameState.WAITING;
        this.arenaData = arenaData;
        this.world = world;
        this.gameTeams = new GameTeam[teamsAmount];
        for (int i = 0; i < teamsAmount; i++) {
            gameTeams[i] = new GameTeam();
        }
    }

    public ArenaData getArenaData() {
        return arenaData;
    }

    public GameState getGameState() {
        return gameState;
    }

    public World getWorld() {
        return world;
    }

    public void setGameState(GameState gameState) {
        this.gameState = gameState;
    }
}
