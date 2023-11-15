package pe.bazan.luis.plugins.cs16mc.commands.games;

import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import pe.bazan.luis.plugins.cs16mc.CS16MC;
import pe.bazan.luis.plugins.cs16mc.commands.Command;
import pe.bazan.luis.plugins.cs16mc.commands.CommandInfo;

import java.util.ArrayList;
import java.util.List;

@CommandInfo(
        name = "game",
        pattern = "game",
        usage = "/game create",
        desc = "Command for create game",
        permission = "cs16mc.commands.game"
)
public class GameCommand implements Command {
    @Override
    public boolean execute(CS16MC plugin, CommandSender sender, String... args) {
        if (args.length < 1) {
            // help panel here
            return false;
        }

        switch (args[0].toLowerCase()) {
            case "create":
                // create game here
                break;
            case "start":
                break;
            case "stop":
                break;
            default:
                // help panel here
                break;
        }
        return false;
    }

    @Override
    public List<String> tab(CS16MC plugin, Player player, String... args) {
        List<String> complete = new ArrayList<>();
        if (args.length == 1) {
            for (String string : "create".split(",")) {
                if (string.startsWith(args[0])) complete.add(string);
            }
            return complete;
        }
        return complete;
    }
}
