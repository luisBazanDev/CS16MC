package pe.bazan.luis.plugins.cs16mc.domain.items.weapons;

import pe.bazan.luis.plugins.cs16mc.domain.enums.WeaponsType;
import pe.bazan.luis.plugins.cs16mc.domain.items.FireArms;
import pe.bazan.luis.plugins.cs16mc.domain.items.weapons.assault.*;

public class Assault extends FireArms implements AK_47, Clarion, Colt_M4A1_Carbine, IDF_Defender, Sig_SG_552_Commando,Steyr_Aug {
    private WeaponsType assaultType;
    public Assault(WeaponsType assaultType) {
        super(getName(assaultType), getType(assaultType), getSide(assaultType), getPrice(assaultType),
                getPriceAmmo(assaultType), getBaseCapacity(assaultType),getExtraCapacity(assaultType), getDamage(assaultType), getSecondaryDamage(assaultType),
                0,0,0);
    }

    private static String getName(WeaponsType assaultType){
            switch (assaultType){
                case CV_47: return AK_47.name;
                case CLARION_5_56: return Clarion.name;
                case MAVERICK_M4A1_CARBINE: return Colt_M4A1_Carbine.name;
                case IDF_DEFENDER: return IDF_Defender.name;
                case KRIEG_552: return Sig_SG_552_Commando.name;
                case BULLPUP: return Steyr_Aug.name;
                default:
                    return null;
            }
    }
    private static String getType(WeaponsType assaulType){
        switch (assaulType){
            case CV_47: return AK_47.type;
            case CLARION_5_56: return Clarion.type;
            case MAVERICK_M4A1_CARBINE: return Colt_M4A1_Carbine.type;
            case IDF_DEFENDER: return IDF_Defender.type;
            case KRIEG_552: return Sig_SG_552_Commando.type;
            case BULLPUP: return Steyr_Aug.type;
            default:
                return null;
        }
    }
    private static String getSide(WeaponsType assaultType){
        switch (assaultType){
            case CV_47: return AK_47.side;
            case CLARION_5_56: return Clarion.side;
            case MAVERICK_M4A1_CARBINE: return Colt_M4A1_Carbine.side;
            case IDF_DEFENDER: return IDF_Defender.side;
            case KRIEG_552: return Sig_SG_552_Commando.side;
            case BULLPUP: return Steyr_Aug.side;
            default:
                return null;
        }
    }
    private static float getPrice(WeaponsType assaultType){
        switch (assaultType){
            case CV_47: return AK_47.price;
            case CLARION_5_56: return Clarion.price;
            case MAVERICK_M4A1_CARBINE: return Colt_M4A1_Carbine.price;
            case IDF_DEFENDER: return IDF_Defender.price;
            case KRIEG_552: return Sig_SG_552_Commando.price;
            case BULLPUP: return Steyr_Aug.price;
            default:
                return 0;
        }
    }
    private static float getPriceAmmo(WeaponsType assaultType){
        switch (assaultType){
            case CV_47: return AK_47.priceAmmo;
            case CLARION_5_56: return Clarion.priceAmmo;
            case MAVERICK_M4A1_CARBINE: return Colt_M4A1_Carbine.priceAmmo;
            case IDF_DEFENDER: return IDF_Defender.priceAmmo;
            case KRIEG_552: return Sig_SG_552_Commando.priceAmmo;
            case BULLPUP: return Steyr_Aug.priceAmmo;
            default:
                return 0;
        }
    }
    private static int getBaseCapacity(WeaponsType assaultType){
        switch (assaultType){
            case CV_47: return AK_47.baseCapacity;
            case CLARION_5_56: return Clarion.baseCapacity;
            case MAVERICK_M4A1_CARBINE: return Colt_M4A1_Carbine.baseCapacity;
            case IDF_DEFENDER: return IDF_Defender.baseCapacity;
            case KRIEG_552: return Sig_SG_552_Commando.baseCapacity;
            case BULLPUP: return Steyr_Aug.baseCapacity;
            default:
                return 0;
        }
    }
    private static int getExtraCapacity(WeaponsType assaultType){
        switch (assaultType){
            case CV_47: return AK_47.extraCapacity;
            case CLARION_5_56: return Clarion.extraCapacity;
            case MAVERICK_M4A1_CARBINE: return Colt_M4A1_Carbine.extraCapacity;
            case IDF_DEFENDER: return IDF_Defender.extraCapacity;
            case KRIEG_552: return Sig_SG_552_Commando.extraCapacity;
            case BULLPUP: return Steyr_Aug.extraCapacity;
            default:
                return 0;
        }
    }
    private static float getDamage(WeaponsType assaulType){
        switch (assaulType){
            case CV_47: return AK_47.damage;
            case CLARION_5_56: return Clarion.damage;
            case MAVERICK_M4A1_CARBINE: return Colt_M4A1_Carbine.damage;
            case IDF_DEFENDER: return IDF_Defender.damage;
            case KRIEG_552: return Sig_SG_552_Commando.damage;
            case BULLPUP: return Steyr_Aug.damage;
            default:
                return 0;
        }
    }
    private static float getSecondaryDamage(WeaponsType assaulType){
        switch (assaulType){
            case CV_47: return AK_47.secondaryDamage;
            case CLARION_5_56: return Clarion.secondaryDamage;
            case MAVERICK_M4A1_CARBINE: return Colt_M4A1_Carbine.secondaryDamage;
            case IDF_DEFENDER: return IDF_Defender.secondaryDamage;
            case KRIEG_552: return Sig_SG_552_Commando.secondaryDamage;
            case BULLPUP: return Steyr_Aug.secondaryDamage;
            default:
                return 0;
        }
    }





}
