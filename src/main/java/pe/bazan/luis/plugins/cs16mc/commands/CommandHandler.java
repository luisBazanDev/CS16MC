package pe.bazan.luis.plugins.cs16mc.commands;

import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabCompleter;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pe.bazan.luis.plugins.cs16mc.CS16MC;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class CommandHandler implements CommandExecutor, TabCompleter {
    private CS16MC plugin;
    private Map<String, Command> commands;

    public CommandHandler(CS16MC plugin) {
        this.plugin = plugin;

        registerCommands();
    }


    @Override
    public boolean onCommand(CommandSender sender, org.bukkit.command.Command command, String label, String[] args) {
        return false;
    }

    @Override
    public List<String> onTabComplete(CommandSender sender, org.bukkit.command.Command command, String label, String[] args) {
        return null;
    }

    private void registerCommands() {
        commands = new LinkedHashMap<>();
    }
}
