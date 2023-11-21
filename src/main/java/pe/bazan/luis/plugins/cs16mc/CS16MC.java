package pe.bazan.luis.plugins.cs16mc;

import org.bukkit.plugin.java.JavaPlugin;
import pe.bazan.luis.plugins.cs16mc.commands.CommandHandler;
import pe.bazan.luis.plugins.cs16mc.configs.ArenasConfig;
import pe.bazan.luis.plugins.cs16mc.configs.MessagesConfig;
import pe.bazan.luis.plugins.cs16mc.controllers.WorldController;
import pe.bazan.luis.plugins.cs16mc.events.JoinServer;

public final class CS16MC extends JavaPlugin {
    private MessagesConfig messagesConfig;
    private ArenasConfig arenasConfig;
    private static CS16MC instance;

    @Override
    public void onEnable() {
        // Plugin startup logic
        instance = this;
        loadConfigs();
        WorldController.getInstance().listWorlds();
        setUpCommandHandler();
        getServer().getPluginManager().registerEvents(new JoinServer(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    public void loadConfigs() {
        // Load all config files
        messagesConfig = new MessagesConfig(this);
        arenasConfig = new ArenasConfig(this);
    }

    public void setUpCommandHandler() {
        getCommand("cs16mc").setExecutor(new CommandHandler(this));
    }

    public static CS16MC getInstance() {
        return instance;
    }

    public ArenasConfig getArenasConfig() {
        return arenasConfig;
    }

    public MessagesConfig getMessagesConfig() {
        return messagesConfig;
    }
}
