package pe.bazan.luis.plugins.cs16mc.domain.items;


import org.bukkit.Bukkit;
import pe.bazan.luis.plugins.cs16mc.CS16MC;

public class FireArms extends WeaponCarrier{

     float weight;
     int rechargeTime;
     int chargerCapacity;
     int currentCapacity;
     boolean reloading;


     public FireArms(float price, float damage, float weight, int rechargeTime, int chargerCapacity, int currentCapacity, boolean reloading) {
          super(price, damage);
          this.weight = weight;
          this.rechargeTime = rechargeTime;
          this.chargerCapacity = chargerCapacity;
          this.currentCapacity= currentCapacity;
          this.reloading= false;
     }

     public boolean shoot(){
          if (currentCapacity > 0 && !reloading){
               //Logica para disparar
               currentCapacity--;
               return true; // si se pudo disparar

          }else if(currentCapacity ==0 && !reloading){
               recharge();
          }
          return  false;
     }
     public void aim(){

     }

     public void recharge(){
          if (currentCapacity < chargerCapacity && !reloading) {
               reloading = true;
               Bukkit.getScheduler().runTaskLater(CS16MC.getPlugin(CS16MC.class), () -> {
                    currentCapacity = chargerCapacity;
                    reloading = false;
               }, rechargeTime);
     }

}

     public float getWeight() {
          return weight;
     }

     public int getCurrentCapacity() {
          return currentCapacity;
     }
}

