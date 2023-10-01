package pe.bazan.luis.plugins.cs16mc.domain.items.grenades;

import pe.bazan.luis.plugins.cs16mc.domain.items.Grenade;

public class SmokeGrenade extends Grenade {
    int duration;

    public SmokeGrenade(String model, int timeDenote,int duration, float ratio) {
        super(model, timeDenote,ratio);
        this.duration= duration;
    }
}
