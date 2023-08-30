package pe.bazan.luis.plugins.cs16mc.commands.test;

import org.bukkit.command.CommandSender;
import pe.bazan.luis.plugins.cs16mc.CS16MC;
import pe.bazan.luis.plugins.cs16mc.commands.Command;
import pe.bazan.luis.plugins.cs16mc.commands.CommandInfo;

@CommandInfo(
        name = "test",
        pattern = "test",
        usage = "/cs16mc test",
        desc = "Only a test command",
        permission = "cs16mc.commands.test.test"
)
public class TestCommand implements Command {
    @Override
    public boolean execute(CS16MC plugin, CommandSender sender, String... args) {
        sender.sendMessage("Hello world");
        return true;
    }
}
