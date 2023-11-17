package pe.bazan.luis.plugins.cs16mc.domain.items.weapons;

import pe.bazan.luis.plugins.cs16mc.domain.enums.WeaponsType;
import pe.bazan.luis.plugins.cs16mc.domain.items.FireArms;
import pe.bazan.luis.plugins.cs16mc.domain.items.weapons.gun.*;


public class Gun extends FireArms implements Desert_Eagle, Dual_Beretta_96G_Elite, FN_Five_Seven, Glock18, HK_USP,SIG_P228 {
    public static WeaponsType gunType;
    public Gun(WeaponsType gunType) {
        super(getName(gunType), getType(gunType), getSide(gunType), getPrice(gunType),
                getPriceAmmo(gunType), getBaseCapacity(gunType), getExtraCapacity(gunType), getDamage(gunType), getSecondaryDamage(gunType),
                0,0,0);
    }


    private static String getName(WeaponsType gunType) {
        switch (gunType){
            case NIGHT_HAWK50C: return Desert_Eagle.name;
            case ELITE_40DUAL: return Dual_Beretta_96G_Elite.name;
            case ES_FIVE_SEVEN: return FN_Five_Seven.name;
            case SIDEARM_9X19MM: return Glock18.name;
            case KM45_TACTICAL: return  HK_USP.name;
            case COMPACT_228: return SIG_P228.name;
            default:
                return null;
        }
    }
    private static String getType(WeaponsType gunType) {
        switch (gunType){
            case NIGHT_HAWK50C: return Desert_Eagle.type;
            case ELITE_40DUAL: return Dual_Beretta_96G_Elite.type;
            case ES_FIVE_SEVEN: return FN_Five_Seven.type;
            case SIDEARM_9X19MM: return Glock18.type;
            case KM45_TACTICAL: return  HK_USP.type;
            case COMPACT_228: return SIG_P228.type;
            default:
                return null;
        }
    }
    private static String getSide(WeaponsType gunType) {
        switch (gunType){
            case NIGHT_HAWK50C: return Desert_Eagle.side;
            case ELITE_40DUAL: return Dual_Beretta_96G_Elite.side;
            case ES_FIVE_SEVEN: return FN_Five_Seven.side;
            case SIDEARM_9X19MM: return Glock18.side;
            case KM45_TACTICAL: return  HK_USP.side;
            case COMPACT_228: return SIG_P228.side;
            default:
                return null;
        }
    }

    private static float getPrice(WeaponsType gunType) {
        switch (gunType){
            case NIGHT_HAWK50C: return Desert_Eagle.price;
            case ELITE_40DUAL: return Dual_Beretta_96G_Elite.price;
            case ES_FIVE_SEVEN: return FN_Five_Seven.price;
            case SIDEARM_9X19MM: return Glock18.price;
            case KM45_TACTICAL: return  HK_USP.price;
            case COMPACT_228: return SIG_P228.price;
            default:
                return 0;
        }
    }
    private static float getPriceAmmo(WeaponsType gunType) {
        switch (gunType){
            case NIGHT_HAWK50C: return Desert_Eagle.priceAmmo;
            case ELITE_40DUAL: return Dual_Beretta_96G_Elite.priceAmmo;
            case ES_FIVE_SEVEN: return FN_Five_Seven.priceAmmo;
            case SIDEARM_9X19MM: return Glock18.priceAmmo;
            case KM45_TACTICAL: return  HK_USP.priceAmmo;
            case COMPACT_228: return SIG_P228.priceAmmo;
            default:
                return 0;
        }
    }
    private static int getBaseCapacity(WeaponsType gunType) {
        switch (gunType){
            case NIGHT_HAWK50C: return Desert_Eagle.baseCapacity;
            case ELITE_40DUAL: return Dual_Beretta_96G_Elite.baseCapacity;
            case ES_FIVE_SEVEN: return FN_Five_Seven.baseCapacity;
            case SIDEARM_9X19MM: return Glock18.baseCapacity;
            case KM45_TACTICAL: return  HK_USP.baseCapacity;
            case COMPACT_228: return SIG_P228.baseCapacity;
            default:
                return 0;
        }
    }
    private static int getExtraCapacity(WeaponsType gunType) {
        switch (gunType){
            case NIGHT_HAWK50C: return Desert_Eagle.extraCapacity;
            case ELITE_40DUAL: return Dual_Beretta_96G_Elite.extraCapacity;
            case ES_FIVE_SEVEN: return FN_Five_Seven.extraCapacity;
            case SIDEARM_9X19MM: return Glock18.extraCapacity;
            case KM45_TACTICAL: return  HK_USP.extraCapacity;
            case COMPACT_228: return SIG_P228.extraCapacity;
            default:
                return 0;
        }
    }
    private static float getDamage(WeaponsType gunType){
        switch (gunType){
            case NIGHT_HAWK50C: return Desert_Eagle.damage;
            case ELITE_40DUAL: return Dual_Beretta_96G_Elite.damage;
            case ES_FIVE_SEVEN: return FN_Five_Seven.damage;
            case SIDEARM_9X19MM: return Glock18.damage;
            case KM45_TACTICAL: return  HK_USP.damage;
            case COMPACT_228: return SIG_P228.damage;
            default:
                return 0;
        }
    }
    private static float getSecondaryDamage(WeaponsType gunType){
        switch (gunType){
            case NIGHT_HAWK50C: return Desert_Eagle.secondaryDamage;
            case ELITE_40DUAL: return Dual_Beretta_96G_Elite.secondaryDamage;
            case ES_FIVE_SEVEN: return FN_Five_Seven.secondaryDamage;
            case SIDEARM_9X19MM: return Glock18.secondaryDamage;
            case KM45_TACTICAL: return  HK_USP.secondaryDamage;
            case COMPACT_228: return SIG_P228.secondaryDamage;
            default:
                return 0;
        }
    }

}
