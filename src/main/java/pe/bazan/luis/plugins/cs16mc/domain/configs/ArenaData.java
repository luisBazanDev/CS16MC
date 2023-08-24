package pe.bazan.luis.plugins.cs16mc.domain.configs;

import org.bukkit.Location;
import org.bukkit.configuration.ConfigurationSection;
import pe.bazan.luis.plugins.cs16mc.domain.enums.MoneyType;

import javax.annotation.Nullable;
import java.util.HashMap;
import java.util.List;

public class ArenaData {
    private String name;
    private String displayName;
    private int rounds;
    private int timeBomb;
    private int timeTimeout;
    private int maxPlayerPerTeam;
    private int minPlayerPerTeam;
    private HashMap<MoneyType, Double> money;
    private Location lobby;
    private Location spectators;
    private List<Location> terrorists;
    private List<Location> counterTerrorists;

    private ArenaData(String name, String displayName, int rounds, int timeBomb, int timeTimeout, int maxPlayerPerTeam, int minPlayerPerTeam, HashMap<MoneyType, Double> money, Location lobby, Location spectators, List<Location> terrorists, List<Location> counterTerrorists) {
        this.name = name;
        this.displayName = displayName;
        this.rounds = rounds;
        this.timeBomb = timeBomb;
        this.timeTimeout = timeTimeout;
        this.maxPlayerPerTeam = maxPlayerPerTeam;
        this.minPlayerPerTeam = minPlayerPerTeam;
        this.money = money;
        this.lobby = lobby;
        this.spectators = spectators;
        this.terrorists = terrorists;
        this.counterTerrorists = counterTerrorists;
    }

    @Nullable
    public static ArenaData makeArena(ConfigurationSection config) {
        // TODO constructor of the object
        return null;
    }

    public String getName() {
        return name;
    }

    public String getDisplayName() {
        return displayName;
    }

    public int getRounds() {
        return rounds;
    }

    public int getTimeBomb() {
        return timeBomb;
    }

    public int getTimeTimeout() {
        return timeTimeout;
    }

    public int getMaxPlayerPerTeam() {
        return maxPlayerPerTeam;
    }

    public int getMinPlayerPerTeam() {
        return minPlayerPerTeam;
    }

    public HashMap<MoneyType, Double> getMoney() {
        return money;
    }

    public Location getLobby() {
        return lobby;
    }

    public Location getSpectators() {
        return spectators;
    }

    public List<Location> getTerrorists() {
        return terrorists;
    }

    public List<Location> getCounterTerrorists() {
        return counterTerrorists;
    }
}
