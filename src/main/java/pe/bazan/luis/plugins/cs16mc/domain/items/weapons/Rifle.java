package pe.bazan.luis.plugins.cs16mc.domain.items.Arms;

import pe.bazan.luis.plugins.cs16mc.domain.items.FireArms;

public class Rifle extends FireArms {
    public Rifle(float price, float damage, float weight, int rechargeTime, int chargerCapacity) {
        super(price, damage, weight, rechargeTime, chargerCapacity);
    }
}
