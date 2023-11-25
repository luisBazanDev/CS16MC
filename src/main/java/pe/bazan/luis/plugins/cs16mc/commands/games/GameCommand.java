package pe.bazan.luis.plugins.cs16mc.commands.games;

import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import pe.bazan.luis.plugins.cs16mc.CS16MC;
import pe.bazan.luis.plugins.cs16mc.commands.Command;
import pe.bazan.luis.plugins.cs16mc.commands.CommandInfo;
import pe.bazan.luis.plugins.cs16mc.controllers.GameController;
import pe.bazan.luis.plugins.cs16mc.domain.enums.MapType;
import pe.bazan.luis.plugins.cs16mc.game.Game;

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
        if (args.length < 2) {
            // help panel here
            return false;
        }

        Game game;
        switch (args[0].toLowerCase()) {
            case "create":
                // create game here
                MapType mapType = MapType.valueOf(args[1]);
                if (mapType == null) {
                    sender.sendMessage("Error: Invalid type");
                    return true;
                }

                game = GameController.getInstance().createGame(mapType, 3);
                sender.sendMessage("Game id: " + game.getGameId());
                break;
            case "start":
                game = GameController.getInstance().getGameById(args[1]);
                if (game == null) {
                    sender.sendMessage("Error: game don't exists");
                    return true;
                }
                if (game.start()) {
                    sender.sendMessage("Game starting...");
                } else {
                    sender.sendMessage("Game don't start");
                }
                break;
            case "stop":
                game = GameController.getInstance().getGameById(args[1]);
                if (game == null) {
                    sender.sendMessage("Error: game don't exists");
                    return true;
                }
                game.stop();
                break;
            case "join":
                game = GameController.getInstance().getGameById(args[1]);
                if (game == null) {
                    sender.sendMessage("Error: game don't exists");
                    return true;
                }
                if (sender instanceof Player) {
                    GameController.getInstance().joinPlayer((Player) sender, game);
                    if (!((Player) sender).getWorld().equals(game.getPluginMap().getCBWorld())) {
                        ((Player) sender).teleport(game.getPluginMap().getSpawn());
                    }
                } else {
                    sender.sendMessage("Error: This command only send from players");
                }
                break;
            default:
                // help panel here
                break;
        }
        return true;
    }

    @Override
    public List<String> tab(CS16MC plugin, Player player, String... args) {
        List<String> complete = new ArrayList<>();

        if (args.length == 1) {
            for (String string : "create,start,stop,join".split(",")) {
                if (string.startsWith(args[0])) complete.add(string);
            }
            return complete;
        }

        if (args.length == 2) {
            switch (args[0].toLowerCase()) {
                case "create":
                    for (MapType mapType : MapType.values()) {
                        if (mapType.name().toLowerCase().startsWith(args[1].toLowerCase()))
                            complete.add(mapType.name());
                    }
                    break;
                case "start", "stop", "join":
                    for (Game game : GameController.getInstance().getGames()) {
                        if (game.getGameId().startsWith(args[1]))
                            complete.add(game.getGameId());
                    }
                    break;
            }
            return complete;
        }

        return complete;
    }
}
