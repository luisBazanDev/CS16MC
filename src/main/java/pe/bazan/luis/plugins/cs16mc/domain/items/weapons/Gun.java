package pe.bazan.luis.plugins.cs16mc.domain.items.weapons;

import pe.bazan.luis.plugins.cs16mc.domain.items.FireArms;

    public class Gun extends FireArms {


        public Gun(float price, float damage, float weight, int rechargeTime, int chargerCapacity) {
            super(price, damage, weight, rechargeTime, chargerCapacity);
        }
    }
