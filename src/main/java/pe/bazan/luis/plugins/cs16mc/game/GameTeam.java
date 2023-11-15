package pe.bazan.luis.plugins.cs16mc.game;

import org.jetbrains.annotations.NotNull;

import java.util.LinkedHashMap;
import java.util.Map;

public class GameTeam {
    private final Map<String, PlayerGame> playersTeam = new LinkedHashMap<>();

    public GameTeam() {

    }

    public boolean isTeam(String nick) {
        return playersTeam.containsKey(nick);
    }

    public void addPlayerTeam(@NotNull PlayerGame playerGame) {
        playersTeam.put(playerGame.getPlayer().getName(), playerGame);
    }

    public void removePlayerTeam(String nick) {
        playersTeam.remove(nick);
    }
}
