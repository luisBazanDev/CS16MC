package pe.bazan.luis.plugins.cs16mc.domain.items.weapons;

import pe.bazan.luis.plugins.cs16mc.domain.enums.WeaponsType;
import pe.bazan.luis.plugins.cs16mc.domain.items.FireArms;
import pe.bazan.luis.plugins.cs16mc.domain.items.weapons.machinegun.FN_M249_Para;

import static pe.bazan.luis.plugins.cs16mc.domain.enums.WeaponsType.M249;

public class MachineGun extends FireArms implements FN_M249_Para {

    private static WeaponsType machineGun;

     public MachineGun(WeaponsType machineGun) {
         super(getName(machineGun), getType(machineGun), getSide(machineGun), getPrice(machineGun), getPriceAmmo(machineGun),
                 getBaseCapacity(machineGun), getExtraCapacity(machineGun), getDamage(machineGun), getSecondaryDamage(machineGun),
                 0,0,0);
     }
     private static String getName(WeaponsType machineGun){
         if(machineGun == M249){
             return FN_M249_Para.name;
         }
         return null;
     }
    private static String getType(WeaponsType machineGun){
        if(machineGun == M249){
            return FN_M249_Para.type;
        }
        return null;
    }
    private static String getSide(WeaponsType machineGun){
        if(machineGun == M249){
            return FN_M249_Para.side;
        }
        return null;
    }
    private static float getPrice(WeaponsType machineGun){
        if(machineGun == M249){
            return FN_M249_Para.price;
        }
        return 0;
    }
    private static float getPriceAmmo(WeaponsType machineGun){
        if(machineGun == M249){
            return FN_M249_Para.priceAmmo;
        }
        return 0;
    }
    private static int getBaseCapacity(WeaponsType machineGun){
        if(machineGun == M249){
            return FN_M249_Para.baseCapacity;
        }
        return 0;
    }
    private static int getExtraCapacity(WeaponsType machineGun){
        if(machineGun == M249){
            return FN_M249_Para.extraCapacity;
        }
        return 0;
    }
    private static float getDamage(WeaponsType machineGun){
        if(machineGun == M249){
            return FN_M249_Para.damage;
        }
        return 0;
    }
    private static float getSecondaryDamage(WeaponsType machineGun){
        if(machineGun == M249){
            return FN_M249_Para.secondaryDamage;
        }
        return 0;
    }
 }
