package pe.bazan.luis.plugins.cs16mc.domain.items;

import org.bukkit.Bukkit;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.event.EventHandler;
import org.bukkit.plugin.java.JavaPlugin;

public class BaseItem extends JavaPlugin {
    ConsoleCommandSender myCmd= Bukkit.getConsoleSender();
    @Override
    public void onEnable(){
        myCmd.sendMessage("§bEl plugin ha sido iniciado");

    }
    @Override
    public  void onDisable(){
        myCmd.sendMessage("§cEl plugin ha sido desactivado");

    }
    public void onClick(){}
    public void onClickLeft(){}
    public void onEquip(){}

}