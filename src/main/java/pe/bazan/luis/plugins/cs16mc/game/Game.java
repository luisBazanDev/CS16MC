package pe.bazan.luis.plugins.cs16mc.game;

import org.bukkit.World;
import pe.bazan.luis.plugins.cs16mc.domain.configs.ArenaData;

public class Game {
    private final GameState gameState;
    private final ArenaData arenaData;
    private final World world;

    public Game(ArenaData arenaData, World world) {
        this.gameState = GameState.WAITING;
        this.arenaData = arenaData;
        this.world = world;
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
}
