package pe.bazan.luis.plugins.cs16mc.configs;

import org.bukkit.configuration.ConfigurationSection;
import org.bukkit.configuration.file.FileConfiguration;
import pe.bazan.luis.plugins.cs16mc.CS16MC;
import pe.bazan.luis.plugins.cs16mc.domain.configs.ArenaData;

import javax.annotation.Nullable;
import java.util.HashMap;

public class ArenasConfig {
    private CustomConfig configFile;
    private CS16MC plugin;
    private HashMap<String, ArenaData> arenas;

    public ArenasConfig(CS16MC plugin) {
        this.plugin = plugin;
        registerConfig();
        load();
    }

    public void registerConfig() {
        configFile = new CustomConfig("arenas.yml", plugin);
        configFile.registerConfig();
    }

    public void load() {
        // Logic to load things
        FileConfiguration config = configFile.getConfig();
        arenas = new HashMap<>();
        for (String key : config.getKeys(false)) {
            ConfigurationSection arenaCOnfig = config.getConfigurationSection(key);
            ArenaData arena = ArenaData.makeArena(arenaCOnfig);
            if (arena == null) {
                plugin.getLogger().info("Error on load arena config: " + key);
                continue;
            }
            arenas.put(key, arena);
            plugin.getLogger().info("Success load arena config: " + key);
        }
    }

    public void reloadConfig(){
        configFile.reloadConfig();
        load();
    }

    public HashMap<String, ArenaData> getArenas() {
        return arenas;
    }

    @Nullable
    public ArenaData getArena(String key) {
        return arenas.get(key);
    }
}
