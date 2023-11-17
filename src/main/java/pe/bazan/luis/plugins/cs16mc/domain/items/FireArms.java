package pe.bazan.luis.plugins.cs16mc.domain.items;


import org.bukkit.Bukkit;
import pe.bazan.luis.plugins.cs16mc.CS16MC;


public class FireArms extends WeaponCarrier{

     String type;
     String side;
     float priceAmmo;
     int rechargeTime;
     int baseCapacity;
     int extraCapacity;
     int chargerCapacity;
     int currentCapacity;
     boolean reloading;

     @Override
     public void onClickRight() {
          recharge();

     }

     @Override
     public void onClickLeft() {
          shoot();
     }

     @Override
     public void onEquip() {

     }

     public FireArms(String name, String type, String side, float price, float priceAmmo, int baseCapacity, int extraCapacity,
             float damage, float secondaryDamage, int rechargeTime, int chargerCapacity, int currentCapacity) {
          super(name, price, damage, secondaryDamage);
          this.priceAmmo= priceAmmo;
          this.side= side;
          this.type= type;
          this.rechargeTime = rechargeTime;
          this.baseCapacity = baseCapacity;
          this.extraCapacity = extraCapacity;
          this.chargerCapacity = chargerCapacity;
          this.currentCapacity = currentCapacity;
          this.reloading = false;
     }

     public boolean shoot() {
          if (currentCapacity > 0 && !reloading) {
               //Logica para disparar
               currentCapacity--;
               return true; // si se pudo disparar

          } else if (currentCapacity == 0 && !reloading) {
               recharge();
          }
          return false;
     }

     public void aim() {

     }

     public void recharge() {
          if (currentCapacity < chargerCapacity && !reloading) {
               reloading = true;
               Bukkit.getScheduler().runTaskLater(CS16MC.getPlugin(CS16MC.class), () -> {
                    currentCapacity = chargerCapacity;
                    reloading = false;
               }, rechargeTime);
          }

     }


     public int getCurrentCapacity() {
          return currentCapacity;
     }


}

