package pe.bazan.luis.plugins.cs16mc.domain.items.weapons;

import pe.bazan.luis.plugins.cs16mc.domain.items.FireArms;
import pe.bazan.luis.plugins.cs16mc.domain.items.weapons.gun.*;

public class Gun extends FireArms implements Desert_Eagle, Dual_Beretta_96G_Elite, FN_Five_Seven, Glock18, HK_USP,SIG_P228 {
    public Gun(float price, float damage, float weight, int rechargeTime, int chargerCapacity, int currentCapacity,boolean reloading) {
        super(price, damage, weight, rechargeTime, chargerCapacity,currentCapacity,reloading);

    }
}
