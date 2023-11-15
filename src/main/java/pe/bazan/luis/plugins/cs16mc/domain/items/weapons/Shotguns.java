package pe.bazan.luis.plugins.cs16mc.domain.items.weapons;

import pe.bazan.luis.plugins.cs16mc.domain.items.FireArms;

public class Shotguns extends FireArms {
    public Shotguns(float price, float damage, float weight, int rechargeTime, int chargerCapacity, int currentCapacity) {
        super(price, damage, weight, rechargeTime, chargerCapacity,currentCapacity);
    }
}
