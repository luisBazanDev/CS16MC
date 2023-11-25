package pe.bazan.luis.plugins.cs16mc.configs;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.configuration.file.FileConfiguration;
import pe.bazan.luis.plugins.cs16mc.CS16MC;

public class PluginConfig {
    private CustomConfig configFile;
    private final CS16MC plugin;
    private Location lobby;

    public PluginConfig(CS16MC plugin) {
        this.plugin = plugin;
        registerConfig();
        load();
    }

    public void registerConfig() {
        configFile = new CustomConfig("config.yml", plugin);
        configFile.registerConfig();
    }

    public void load() {
        // Logic to load things
        FileConfiguration config = configFile.getConfig();
        lobby = Bukkit.getWorld(config.getString("lobby")).getSpawnLocation();
    }

    public void reloadConfig() {
        configFile.reloadConfig();
        load();
    }

    public Location getLobby() {
        return lobby;
    }
}
