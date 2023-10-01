package pe.bazan.luis.plugins.cs16mc.domain.items;

public class FireArms extends WeaponCarrier{
     float weight;
     int rechargeTime;
     int chargerCapacity;
     int currentCapacity;


     public FireArms(float price, float damage, float weight, int rechargeTime, int chargerCapacity, int currentCapacity) {
          super(price, damage);
          this.weight = weight;
          this.rechargeTime = rechargeTime;
          this.chargerCapacity = chargerCapacity;
          this.currentCapacity= currentCapacity;
     }

     public void shoot(){}
     public void aim(){}
     public void recharge(){}

}
