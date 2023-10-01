package pe.bazan.luis.plugins.cs16mc.domain.items;

public class Grenade extends BaseItem {
    String model;
    int timeDenote;
    float ratio;

    public Grenade(String model,int timeDenote, float ratio){
        this.model= model;
        this.timeDenote= timeDenote;
        this.ratio= ratio;
    }
}
