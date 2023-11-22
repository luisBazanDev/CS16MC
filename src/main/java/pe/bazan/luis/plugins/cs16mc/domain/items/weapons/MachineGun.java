package pe.bazan.luis.plugins.cs16mc.domain.items.weapons;

import pe.bazan.luis.plugins.cs16mc.domain.items.FireArms;

public class MachineGun extends FireArms {

    public MachineGun(float price, float damage, float weight, int rechargeTime, int chargerCapacity) {
        super(price, damage, weight, rechargeTime, chargerCapacity);
    }
}
