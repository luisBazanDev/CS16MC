package pe.bazan.luis.plugins.cs16mc.controllers;

import com.onarandombox.MultiverseCore.MultiverseCore;
import com.onarandombox.MultiverseCore.api.MultiverseWorld;
import org.bukkit.Bukkit;
import org.bukkit.World;
import pe.bazan.luis.plugins.cs16mc.domain.PluginMap;
import pe.bazan.luis.plugins.cs16mc.domain.enums.MapType;

import java.util.LinkedHashMap;

public class WorldController {
    private static WorldController instance;
    private final LinkedHashMap<String, PluginMap> worlds;
    private final MultiverseCore core = (MultiverseCore) Bukkit.getServer().getPluginManager().getPlugin("Multiverse-Core");

    private WorldController() {
        worlds = new LinkedHashMap<>();
    }

    public static WorldController getInstance() {
        if (instance == null) {
            instance = new WorldController();
        }
        return instance;
    }

    public void listWorlds() {
        for (MultiverseWorld world : core.getMVWorldManager().getMVWorlds()) {
            if (!world.getName().toLowerCase().startsWith("cs16mc")) return;
            core.getMVWorldManager().unloadWorld(world.getName());

            worlds.put(world.getName(), new PluginMap(
                    MapType.resolveType(world.getName()),
                    null,
                    world
            ));

            core.getMVWorldManager().unloadWorld(world.getName());
        }
    }

    public PluginMap getWorld(String name) {
        return worlds.get(name);
    }

    public PluginMap getWorld(World world) {
        return getWorld(world.getName());
    }
}
