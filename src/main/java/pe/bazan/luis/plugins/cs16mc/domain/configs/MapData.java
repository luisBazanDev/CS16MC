package pe.bazan.luis.plugins.cs16mc.domain.configs;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.configuration.ConfigurationSection;
import org.jetbrains.annotations.NotNull;
import pe.bazan.luis.plugins.cs16mc.domain.enums.MoneyType;

import javax.annotation.Nullable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MapData {
    private final String name;
    private final String displayName;
    private final int rounds;
    private final int timeBomb;
    private final int timeTimeout;
    private final int maxPlayerPerTeam;
    private final int minPlayerPerTeam;
    private final HashMap<MoneyType, Double> money;
    private final Location lobby;
    private final Location spectators;
    private final List<Location> terrorists;
    private final List<Location> counterTerrorists;

    private MapData(String name, String displayName, int rounds, int timeBomb, int timeTimeout, int maxPlayerPerTeam, int minPlayerPerTeam, HashMap<MoneyType, Double> money, Location lobby, Location spectators, List<Location> terrorists, List<Location> counterTerrorists) {
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
    public static MapData makeArena(ConfigurationSection config) {
        String name = config.getName();
        String displayName = config.getString("displayName");
        int rounds = config.getInt("rounds", 5);
        World world = Bukkit.getWorld(config.getString("world", ""));
        if (world == null || name == null || displayName == null) return null;
        int timeBob = config.getInt("times.bomb", 40);
        int timeTimeout = config.getInt("times.timeout", 600);
        int maxPlayersPerTeam = config.getInt("players-per-team.max", 5);
        int minPlayersPerTeam = config.getInt("players-per-team.max", 1);
        HashMap money = new HashMap();
        money.put(MoneyType.MAX, config.getInt("money.max", -1));
        money.put(MoneyType.BASE, config.getInt("money.base", 800));
        money.put(MoneyType.KILL, config.getInt("money.kill", 600));
        money.put(MoneyType.ASSISTANT, config.getInt("money.assistant", -1));
        money.put(MoneyType.PLACE_BOMB, config.getInt("money.place-bomb", -1));
        money.put(MoneyType.WIN, config.getInt("money.win", 1000));
        money.put(MoneyType.LOST, config.getInt("money.lost", 300));

        List<Integer> lobby = config.getIntegerList("spawn.lobby");
        List<Integer> spectator = config.getIntegerList("spawn.spectator");
        List terrorist = config.getList("spawn.terrorist");
        List counterTerrorist = config.getList("spawn.counter-terrorist");
        if (
                lobby.size() != 3
                        || spectator.size() != 3
                        || terrorist.size() == 0
                        || counterTerrorist.size() == 0
        ) return null;
        List<Location> terroristLocations = new ArrayList<>();
        List<Location> counterTerroristLocations = new ArrayList<>();

        for (int i = 0; i < terrorist.size(); i++) {
            List<Integer> point = config.getIntegerList("spawn.terrorist." + i);
            if (point.size() != 3) continue;
            terroristLocations.add(resolveLocation(world, point.stream().mapToInt(Integer::intValue).toArray()));
        }

        for (int i = 0; i < counterTerrorist.size(); i++) {
            List<Integer> point = config.getIntegerList("spawn.counter-terrorist." + i);
            if (point.size() != 3) continue;
            counterTerroristLocations.add(resolveLocation(world, point.stream().mapToInt(Integer::intValue).toArray()));
        }

        return new MapData(
                name,
                displayName,
                rounds,
                timeBob,
                timeTimeout,
                maxPlayersPerTeam,
                minPlayersPerTeam,
                money,
                resolveLocation(world, lobby.stream().mapToInt(Integer::intValue).toArray()),
                resolveLocation(world, lobby.stream().mapToInt(Integer::intValue).toArray()),
                terroristLocations,
                counterTerroristLocations
        );
    }

    @Nullable
    private static Location resolveLocation(@NotNull World world, @NotNull int[] cords) {
        if (cords.length != 3) return null;
        return new Location(world, cords[0], cords[1], cords[2]);
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
