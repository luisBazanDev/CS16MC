package pe.bazan.luis.plugins.cs16mc.domain;

import com.onarandombox.MultiverseCore.api.MultiverseWorld;
import pe.bazan.luis.plugins.cs16mc.domain.enums.MapType;
import pe.bazan.luis.plugins.cs16mc.game.Game;

public class PluginMap {
    private final MapType mapType;
    private Game game;
    private final MultiverseWorld world;

    public PluginMap(MapType mapType, Game game, MultiverseWorld world) {
        this.mapType = mapType;
        this.game = game;
        this.world = world;
    }

    public MapType getMapType() {
        return mapType;
    }

    public Game getGame() {
        return game;
    }

    public MultiverseWorld getWorld() {
        return world;
    }

    public void setGame(Game game) {
        this.game = game;
    }
}
