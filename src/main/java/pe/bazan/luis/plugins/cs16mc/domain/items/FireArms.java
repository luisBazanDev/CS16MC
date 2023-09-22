package pe.bazan.luis.plugins.cs16mc.domain.items;

public class FireArms extends WeaponCarrier{
     float weight;
     int rechargeTime;
     int chargerCapacity;

     public FireArms(float price, float damage, float weight, int rechargeTime, int chargerCapacity) {
          super(price, damage);
          this.weight = weight;
          this.rechargeTime = rechargeTime;
          this.chargerCapacity = chargerCapacity;
     }

     public void shoot(){}
     public void aim(){}
     public void recharge(){}

}
