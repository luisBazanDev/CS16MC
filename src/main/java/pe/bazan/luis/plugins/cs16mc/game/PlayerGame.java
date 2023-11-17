package pe.bazan.luis.plugins.cs16mc.game;

import org.bukkit.entity.Player;

public class PlayerGame {
    final private Player player;
    private final double money;
    private final int kills;
    private final int deaths;
    private final int assistants;
    private final Game game;

    private PlayerGame(Player player, Game game) {
        this.player = player;
        this.money = 0;
        this.kills = 0;
        this.deaths = 0;
        this.assistants = 0;
        this.game = game;
    }

    public Player getPlayer() {
        return player;
    }

    public double getMoney() {
        return money;
    }

    public int getKills() {
        return kills;
    }

    public int getDeaths() {
        return deaths;
    }

    public int getAssistants() {
        return assistants;
    }

    public Game getGame() {
        return game;
    }
}
