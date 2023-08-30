package pe.bazan.luis.plugins.cs16mc;

import org.bukkit.plugin.java.JavaPlugin;
import pe.bazan.luis.plugins.cs16mc.commands.CommandHandler;
import pe.bazan.luis.plugins.cs16mc.events.JoinServer;

public final class CS16MC extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        setUpCommandHandler();
        getServer().getPluginManager().registerEvents(new JoinServer(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    public void setUpCommandHandler() {
        getCommand("cs16mc").setExecutor(new CommandHandler(this));
    }
}
