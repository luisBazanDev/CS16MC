package pe.bazan.luis.plugins.cs16mc.commands.test;

import org.bukkit.Bukkit;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import pe.bazan.luis.plugins.cs16mc.CS16MC;
import pe.bazan.luis.plugins.cs16mc.commands.Command;
import pe.bazan.luis.plugins.cs16mc.commands.CommandInfo;
import pe.bazan.luis.plugins.cs16mc.controllers.WorldController;
import pe.bazan.luis.plugins.cs16mc.domain.PluginMap;

import java.util.List;

@CommandInfo(
        name = "world",
        pattern = "world",
        usage = "/cs16mc world",
        desc = "Only a world test command",
        permission = "cs16mc.commands.test.world"
)
public class WorldTestCommand implements Command {
    @Override
    public boolean execute(CS16MC plugin, CommandSender sender, String... args) {
        if (args.length < 1) return false;
        String world = args[0];
        if (Bukkit.getWorld(world) == null) {
            sender.sendMessage("World don't exists");
            return true;
        }

        PluginMap pluginMap = WorldController.getInstance().cloneWorld(world);

        if (pluginMap != null) {
            sender.sendMessage("World cloned!");
            if (sender instanceof Player) {
                ((Player) sender).teleport(pluginMap.getSpawn());
            }
            return true;
        } else {
            sender.sendMessage("World clone error, logs in your console maybe :/");
        }

        return true;
    }

    @Override
    public List<String> tab(CS16MC plugin, Player player, String... args) {
        if (args.length == 1) {
            return WorldController.getInstance().getCore().getMVWorldManager().getMVWorlds().stream()
                    .map(world -> world.getName())
                    .filter(name -> name.toLowerCase().startsWith(args[0].toLowerCase()))
                    .toList();
        }
        return Command.super.tab(plugin, player, args);
    }
}
