package pe.bazan.luis.plugins.cs16mc.game;

import java.util.LinkedHashMap;
import java.util.Map;

public class GameTeam {
    private final Map<String, PlayerGame> playersTeam = new LinkedHashMap<>();

    public GameTeam() {

    }

    public boolean isTeam(String nick) {
        return playersTeam.containsKey(nick);
    }
}
