package pe.bazan.luis.plugins.cs16mc.configs;

import org.bukkit.configuration.file.FileConfiguration;
import pe.bazan.luis.plugins.cs16mc.CS16MC;

public class MessagesConfig {
    private CustomConfig configFile;
    private CS16MC plugin;

    public MessagesConfig(CS16MC plugin) {
        this.plugin = plugin;
        registerConfig();
        load();
    }

    public void registerConfig() {
        configFile = new CustomConfig("messages.yml", plugin);
        configFile.registerConfig();
    }

    public void load() {
        // Logic to load things
        FileConfiguration config = configFile.getConfig();
    }

    public void reloadConfig(){
        configFile.reloadConfig();
        load();
    }

    /**
     * Get message from the config
     * @param path a path in the config file
     * @return a value
     */
    public String get(String path) {
        return configFile.getConfig().getString(path);
    }
}
