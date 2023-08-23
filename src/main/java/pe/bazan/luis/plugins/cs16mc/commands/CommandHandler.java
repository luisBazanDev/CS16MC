package pe.bazan.luis.plugins.cs16mc.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabCompleter;
import org.bukkit.conversations.Conversable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pe.bazan.luis.plugins.cs16mc.CS16MC;
import pe.bazan.luis.plugins.cs16mc.commands.test.TestCommand;

import java.util.*;

public class CommandHandler implements CommandExecutor, TabCompleter {
    private CS16MC plugin;
    private Map<String, Command> commands;

    public CommandHandler(CS16MC plugin) {
        this.plugin = plugin;

        registerCommands();
    }


    @Override
    public boolean onCommand(CommandSender sender, org.bukkit.command.Command cmd, String label, String[] args) {
        // Grab the base and arguments.
        String base = (args.length > 0 ? args[0] : "").toLowerCase();
        String last = (args.length > 0 ? args[args.length - 1] : "").toLowerCase();

        // If the player is in a convo (Setup Mode), bail
        if (sender instanceof Conversable && ((Conversable) sender).isConversing()) {
            return true;
        }

        // If there's no base argument, show a helpful message.
        if (base.equals("")) {
            return true;
        }

        // Get all commands that match the base.
        List<Command> matches = getMatchingCommands(base);

        // If there's more than one match, display them.
        if (matches.size() > 1) {
            return true;
        }


        // Grab the only match.
        Command command  = matches.get(0);
        CommandInfo info = command.getClass().getAnnotation(CommandInfo.class);

        // First check if the sender has permission.
        if (!sender.hasPermission(info.permission())) {
            sender.sendMessage(info.permission());
            return true;
        }

        // Otherwise, execute the command!
        String[] params = trimFirstArg(args);
        if (!command.execute(plugin, sender, params)) {
            showUsage(command, sender);
        }

        return true;
    }

    private String[] trimFirstArg(String[] args) {
        return Arrays.copyOfRange(args, 1, args.length);
    }

    @Override
    public List<String> onTabComplete(CommandSender sender, org.bukkit.command.Command command, String label, String[] args) {
        return null;
    }

    private List<Command> getMatchingCommands(String arg) {
        List<Command> result = new ArrayList<>();

        // Grab the commands that match the argument.
        for (Map.Entry<String,Command> entry : commands.entrySet()) {
            if (arg.matches(entry.getKey())) {
                result.add(entry.getValue());
            }
        }

        return result;
    }

    private void showUsage(Command command, CommandSender sender) {
        sender.sendMessage(ChatColor.translateAlternateColorCodes('&',
                String.format("Usage: ", command.getClass().getAnnotation(CommandInfo.class).usage())
                ));
    }

    private void registerCommands() {
        commands = new HashMap<>();
        register(TestCommand.class);
    }

    /**
     * Register a command.
     * @param cmd a Command
     */
    private void register(Class<? extends Command> cmd) {
        try {
            Command command = cmd.newInstance();
            register(command);
        } catch (ReflectiveOperationException e) {
            throw new IllegalArgumentException("Failed to instantiate Command class: " + cmd.getName(), e);
        }
    }

    /**
     * Register a command
     * @param cmd a Command
     */
    public void register(Command cmd) {
        Class<?> cls = cmd.getClass();
        CommandInfo info = cls.getAnnotation(CommandInfo.class);
        if(info == null) {
            throw new IllegalArgumentException("Missing CommandInfo annotation on class " + cls.getName());
        }

        commands.put(info.pattern(), cmd);
    }
}
