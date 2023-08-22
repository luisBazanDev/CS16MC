package pe.bazan.luis.plugins.cs16mc.commands;

import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import pe.bazan.luis.plugins.cs16mc.CS16MC;

import java.util.Collections;
import java.util.List;

public interface Command {
    /**
     *
     * @param plugin the plugin
     * @param sender the sender
     * @param args array of arguments
     * @return true, if the command succeeded in any way, false if the
     * command handler should print the usage message to the sender
     */
    boolean execute(CS16MC plugin, CommandSender sender, String... args);

    /**
     * Tab complete the given arguments.
     * @param plugin the plugin
     * @param player the sender
     * @param args array of arguments
     * @return a list of possible completions, or null
     */
    default List<String> tab(CS16MC plugin, Player player, String... args) {
        return Collections.emptyList();
    }
}
