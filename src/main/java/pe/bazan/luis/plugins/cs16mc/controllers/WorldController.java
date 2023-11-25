package pe.bazan.luis.plugins.cs16mc.controllers;

import com.onarandombox.MultiverseCore.MultiverseCore;
import com.onarandombox.MultiverseCore.api.MultiverseWorld;
import org.bukkit.Bukkit;
import org.bukkit.World;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pe.bazan.luis.plugins.cs16mc.CS16MC;
import pe.bazan.luis.plugins.cs16mc.domain.PluginMap;
import pe.bazan.luis.plugins.cs16mc.domain.enums.MapType;

import java.util.LinkedHashMap;

public class WorldController {
    // World name format: prefix_name_id id start in 1
    private final String prefix = "cs16mc";
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
            if (!world.getName().toLowerCase().startsWith(prefix)) continue;
            worlds.put(world.getName(), new PluginMap(world));
            CS16MC.getInstance().getLogger().info("Register new world: " + world.getName());
        }
    }

    public PluginMap getWorld(String name) {
        return worlds.get(name);
    }

    public PluginMap getWorld(World world) {
        return getWorld(world.getName());
    }

    @Nullable
    public PluginMap cloneWorld(String originalWorld) {
        assert core != null;
        String newWorldName = String.format("%s_%s_%d", prefix, originalWorld, countWorldsOf(originalWorld) + 1);
        if (core.getMVWorldManager().cloneWorld(originalWorld, newWorldName)) {
            PluginMap pluginMap = new PluginMap(core.getMVWorldManager().getMVWorld(newWorldName));
            worlds.put(newWorldName, pluginMap);
            return pluginMap;
        }
        return null;
    }

    public int countWorldsOf(@NotNull String name) {
        int counter = 0;
        for (String worldName : worlds.keySet()) {
            if (name.equalsIgnoreCase(worldName.split("_")[1]))
                counter++;
        }
        return counter;
    }

    public PluginMap getFreeMap(MapType type) {
        for (PluginMap pluginMap : worlds.values()) {
            if (!type.equals(pluginMap.getMapType())) continue;
            if (!pluginMap.isFree()) continue;
            return pluginMap;
        }

        // Intent create a new world
        return cloneWorld(type.name().toLowerCase());
    }

    public MultiverseCore getCore() {
        return core;
    }
}
