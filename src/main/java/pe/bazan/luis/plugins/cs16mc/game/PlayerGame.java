package pe.bazan.luis.plugins.cs16mc.domain;

import org.bukkit.entity.Player;

public class PlayerGame {
    final private Player player;
    private double money;
    private int kills;
    private int deaths;
    private int assistants;

    private PlayerGame(Player player) {
        this.player = player;
        this.money = 0;
        this.kills = 0;
        this.deaths = 0;
        this.assistants = 0;
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
}
