package pe.bazan.luis.plugins.cs16mc.events;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerSwapHandItemsEvent;
import org.bukkit.inventory.ItemStack;

public class ItemInMainHandEvent implements Listener {
    @EventHandler
    public void onNewItemInHand(PlayerSwapHandItemsEvent e) {
        ItemStack itemStack = e.getMainHandItem();

        // Call the method
    }
}
