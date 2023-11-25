package pe.bazan.luis.plugins.cs16mc.game;

import pe.bazan.luis.plugins.cs16mc.controllers.GameController;
import pe.bazan.luis.plugins.cs16mc.domain.PluginMap;
import pe.bazan.luis.plugins.cs16mc.domain.configs.MapData;

public class Game {
    private GameState gameState;
    private final MapData mapData;
    private final PluginMap pluginMap;
    private final GameTeam[] gameTeams;

    public Game(MapData mapData, PluginMap pluginMap, int teamsAmount) {
        this.gameState = GameState.WAITING;
        this.mapData = mapData;
        this.pluginMap = pluginMap;
        this.gameTeams = new GameTeam[teamsAmount];
        for (int i = 0; i < teamsAmount; i++) {
            gameTeams[i] = new GameTeam();
        }
    }

    public MapData getArenaData() {
        return mapData;
    }

    public GameState getGameState() {
        return gameState;
    }

    public PluginMap getPluginMap() {
        return pluginMap;
    }

    public void setGameState(GameState gameState) {
        this.gameState = gameState;
    }

    public boolean start() {
        if (!gameState.equals(GameState.WAITING)) return false;
        gameState = GameState.STARTING;
        return true;
    }

    public void stop() {
        GameController.getInstance().stopGame(this);
    }

    public String getGameId() {
        return pluginMap.getCBWorld().getName().replaceFirst("cs16mc_", "");
    }
}
