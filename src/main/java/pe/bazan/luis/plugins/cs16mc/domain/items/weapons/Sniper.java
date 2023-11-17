package pe.bazan.luis.plugins.cs16mc.domain.items.weapons;

import pe.bazan.luis.plugins.cs16mc.domain.enums.WeaponsType;
import pe.bazan.luis.plugins.cs16mc.domain.items.FireArms;
import pe.bazan.luis.plugins.cs16mc.domain.items.weapons.sniper.Magnum;
import pe.bazan.luis.plugins.cs16mc.domain.items.weapons.sniper.SG_1_Sniper_Rifle;
import pe.bazan.luis.plugins.cs16mc.domain.items.weapons.sniper.Sig_SG_550_Sniper;
import pe.bazan.luis.plugins.cs16mc.domain.items.weapons.sniper.Steyr_Scout;

public class Sniper extends FireArms implements Magnum, SG_1_Sniper_Rifle, Sig_SG_550_Sniper, Steyr_Scout {
    private static WeaponsType sniperType;
    public Sniper(WeaponsType sniperType) {
        super(getName(sniperType), getType(sniperType), getSide(sniperType), getPrice(sniperType),
                getPriceAmmo(sniperType), getBaseCapacity(sniperType),getExtraCapacity(sniperType), getDamage(sniperType), getSecondaryDamage(sniperType),
                0,0,0);
    }
    private static String getName(WeaponsType sniperType){
        switch (sniperType){
            case MAGNUM_SNIPER_RIFLE: return Magnum.name;
            case D3_AU_1: return SG_1_Sniper_Rifle.name;
            case KRIEG_550_COMMANDO: return Sig_SG_550_Sniper.name;
            case SCHMIDT_SCOUT: return Steyr_Scout.name;
            default:
                return null;
        }
    }
    private static String getType(WeaponsType sniperType){
        switch (sniperType){
            case MAGNUM_SNIPER_RIFLE: return Magnum.type;
            case D3_AU_1: return SG_1_Sniper_Rifle.type;
            case KRIEG_550_COMMANDO: return Sig_SG_550_Sniper.type;
            case SCHMIDT_SCOUT: return Steyr_Scout.type;
            default:
                return null;
        }
    }
    private static String getSide(WeaponsType sniperType){
        switch (sniperType){
            case MAGNUM_SNIPER_RIFLE: return Magnum.side;
            case D3_AU_1: return SG_1_Sniper_Rifle.side;
            case KRIEG_550_COMMANDO: return Sig_SG_550_Sniper.side;
            case SCHMIDT_SCOUT: return Steyr_Scout.side;
            default:
                return null;
        }
    }
    private static float getPrice(WeaponsType sniperType){
        switch (sniperType){
            case MAGNUM_SNIPER_RIFLE: return Magnum.price;
            case D3_AU_1: return SG_1_Sniper_Rifle.price;
            case KRIEG_550_COMMANDO: return Sig_SG_550_Sniper.price;
            case SCHMIDT_SCOUT: return Steyr_Scout.price;
            default:
                return 0;
        }
    }
    private static float getPriceAmmo(WeaponsType sniperType){
        switch (sniperType){
            case MAGNUM_SNIPER_RIFLE: return Magnum.priceAmmo;
            case D3_AU_1: return SG_1_Sniper_Rifle.priceAmmo;
            case KRIEG_550_COMMANDO: return Sig_SG_550_Sniper.priceAmmo;
            case SCHMIDT_SCOUT: return Steyr_Scout.priceAmmo;
            default:
                return 0;
        }
    }
    private static int getBaseCapacity(WeaponsType sniperType){
        switch (sniperType){
            case MAGNUM_SNIPER_RIFLE: return Magnum.baseCapacity;
            case D3_AU_1: return SG_1_Sniper_Rifle.baseCapacity;
            case KRIEG_550_COMMANDO: return Sig_SG_550_Sniper.baseCapacity;
            case SCHMIDT_SCOUT: return Steyr_Scout.baseCapacity;
            default:
                return 0;
        }
    }
    private static int getExtraCapacity(WeaponsType sniperType){
        switch (sniperType){
            case MAGNUM_SNIPER_RIFLE: return Magnum.extraCapacity;
            case D3_AU_1: return SG_1_Sniper_Rifle.extraCapacity;
            case KRIEG_550_COMMANDO: return Sig_SG_550_Sniper.extraCapacity;
            case SCHMIDT_SCOUT: return Steyr_Scout.extraCapacity;
            default:
                return 0;
        }
    }
    private static float getDamage(WeaponsType sniperType){
        switch (sniperType){
            case MAGNUM_SNIPER_RIFLE: return Magnum.damage;
            case D3_AU_1: return SG_1_Sniper_Rifle.damage;
            case KRIEG_550_COMMANDO: return Sig_SG_550_Sniper.damage;
            case SCHMIDT_SCOUT: return Steyr_Scout.damage;
            default:
                return 0;
        }
    }
    private static float getSecondaryDamage(WeaponsType sniperType){
        switch (sniperType){
            case MAGNUM_SNIPER_RIFLE: return Magnum.secondaryDamage;
            case D3_AU_1: return SG_1_Sniper_Rifle.secondaryDamage;
            case KRIEG_550_COMMANDO: return Sig_SG_550_Sniper.secondaryDamage;
            case SCHMIDT_SCOUT: return Steyr_Scout.secondaryDamage;
            default:
                return 0;
        }
    }
}
