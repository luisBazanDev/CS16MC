package pe.bazan.luis.plugins.cs16mc.domain.items.weapons;

import pe.bazan.luis.plugins.cs16mc.domain.enums.WeaponsType;
import pe.bazan.luis.plugins.cs16mc.domain.items.FireArms;
import pe.bazan.luis.plugins.cs16mc.domain.items.weapons.shotguns.Benelli_M3_Super90;
import pe.bazan.luis.plugins.cs16mc.domain.items.weapons.shotguns.Benelli_XM1014;

public class Shotguns extends FireArms implements Benelli_XM1014, Benelli_M3_Super90 {
    private static WeaponsType shotgunsType;
    public Shotguns(WeaponsType shotgunsType) {
        super(getName(shotgunsType), getType(shotgunsType), getSide(shotgunsType), getPrice(shotgunsType), getPriceAmmo(shotgunsType),
                getbaseCapacity(shotgunsType), getExtraCapacity(shotgunsType), getDamage(shotgunsType), getSecondaryDamage(shotgunsType),
                0,0,0);
    }

    private static String getName(WeaponsType shotgunsType){
        switch (shotgunsType){
            case LEONE12_GAUGE_SUPER: return Benelli_M3_Super90.name;
            case LEONE_YG1265_AUTO_SHOTGUN: return Benelli_XM1014.name;
            default:
                return null;
        }

    }
    private static String getType(WeaponsType shotgunsType){
        switch (shotgunsType){
            case LEONE12_GAUGE_SUPER: return Benelli_M3_Super90.type;
            case LEONE_YG1265_AUTO_SHOTGUN: return Benelli_XM1014.type;
            default:
                return null;
        }
    }
    private static String getSide(WeaponsType shotgunsType){
        switch (shotgunsType){
            case LEONE12_GAUGE_SUPER: return Benelli_M3_Super90.side;
            case LEONE_YG1265_AUTO_SHOTGUN: return Benelli_XM1014.side;
            default:
                return null;
        }
    }
    private static float getPrice(WeaponsType shotgunsType){
        switch (shotgunsType){
            case LEONE12_GAUGE_SUPER: return Benelli_M3_Super90.price;
            case LEONE_YG1265_AUTO_SHOTGUN: return Benelli_XM1014.price;
            default:
                return 0;
        }
    }

    private static float getPriceAmmo(WeaponsType shotgunsType){
        switch (shotgunsType){
            case LEONE12_GAUGE_SUPER: return Benelli_M3_Super90.priceAmmo;
            case LEONE_YG1265_AUTO_SHOTGUN: return Benelli_XM1014.priceAmmo;
            default:
                return 0;
        }
    }
    private static int getbaseCapacity(WeaponsType shotgunsType){
        switch (shotgunsType){
            case LEONE12_GAUGE_SUPER: return Benelli_M3_Super90.baseCapacity;
            case LEONE_YG1265_AUTO_SHOTGUN: return Benelli_XM1014.baseCapacity;
            default:
                return 0;
        }
    }
    private static int getExtraCapacity(WeaponsType shotgunsType){
        switch (shotgunsType){
            case LEONE12_GAUGE_SUPER: return Benelli_M3_Super90.extraCapacity;
            case LEONE_YG1265_AUTO_SHOTGUN: return Benelli_XM1014.extraCapacity;
            default:
                return 0;
        }
    }
    private static float getDamage(WeaponsType shotgunsType){
        switch (shotgunsType){
            case LEONE12_GAUGE_SUPER: return Benelli_M3_Super90.damage;
            case LEONE_YG1265_AUTO_SHOTGUN: return Benelli_XM1014.damage;
            default:
                return 0;
        }
    }
    private static float getSecondaryDamage(WeaponsType shotgunsType){
        switch (shotgunsType){
            case LEONE12_GAUGE_SUPER: return Benelli_M3_Super90.secondaryDamage;
            case LEONE_YG1265_AUTO_SHOTGUN: return Benelli_XM1014.secondaryDamage;
            default:
                return 0;
        }
    }


}
