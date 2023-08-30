package pe.bazan.luis.plugins.cs16mc.events;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class JoinServer implements Listener {
    @EventHandler
    public void onJoinPlayer(PlayerJoinEvent event) {
        event.getPlayer().sendMessage("JAJA ENTRASTE jugador: " + event.getPlayer().getName());
    }
}
