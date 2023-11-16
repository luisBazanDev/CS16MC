package pe.bazan.luis.plugins.cs16mc.domain.items.weapons;

import pe.bazan.luis.plugins.cs16mc.domain.enums.WeaponsType;
import pe.bazan.luis.plugins.cs16mc.domain.items.FireArms;
import pe.bazan.luis.plugins.cs16mc.domain.items.weapons.submachinegun.*;

public class SubmachineGun extends FireArms implements FN_P90, HK_MP5_Navy, HK_UMP45, Ingram_MAC_10, Steyr_Tactical_Machine_Pistol {
    private static WeaponsType subMachineGunType;
    public SubmachineGun(WeaponsType subMachineGunType) {
        super(getName(subMachineGunType), getType(subMachineGunType), getSide(subMachineGunType), getPrice(subMachineGunType),
                getPriceAmmo(subMachineGunType), getBaseCapacity(subMachineGunType),getExtraCapacity(subMachineGunType), getDamage(subMachineGunType), getSecondaryDamage(subMachineGunType),
                0,0,0);
    }
    private static String getName(WeaponsType subMachineGunType){
        switch (subMachineGunType){
            case ES_C90: return FN_P90.name;
            case KM_SUB_MACHINE_GUN: return HK_MP5_Navy.name;
            case KM_UMP45: return HK_UMP45.name;
            case INGRAM_MAC_10: return Ingram_MAC_10.name;
            case SCHMIDT_MACHINE_PISTOL: return Steyr_Tactical_Machine_Pistol.name;
            default:
                return null;
        }
    }
    private static String getType(WeaponsType subMachineGunType){
        switch (subMachineGunType){
            case ES_C90: return FN_P90.type;
            case KM_SUB_MACHINE_GUN: return HK_MP5_Navy.type;
            case KM_UMP45: return HK_UMP45.type;
            case INGRAM_MAC_10: return Ingram_MAC_10.type;
            case SCHMIDT_MACHINE_PISTOL: return Steyr_Tactical_Machine_Pistol.type;
            default:
                return null;
        }
    }
    private static String getSide(WeaponsType subMachineGunType){
        switch (subMachineGunType){
            case ES_C90: return FN_P90.side;
            case KM_SUB_MACHINE_GUN: return HK_MP5_Navy.side;
            case KM_UMP45: return HK_UMP45.side;
            case INGRAM_MAC_10: return Ingram_MAC_10.side;
            case SCHMIDT_MACHINE_PISTOL: return Steyr_Tactical_Machine_Pistol.side;
            default:
                return null;
        }
    }
    private static float getPrice(WeaponsType subMachineGunType){
        switch (subMachineGunType){
            case ES_C90: return FN_P90.price;
            case KM_SUB_MACHINE_GUN: return HK_MP5_Navy.price;
            case KM_UMP45: return HK_UMP45.price;
            case INGRAM_MAC_10: return Ingram_MAC_10.price;
            case SCHMIDT_MACHINE_PISTOL: return Steyr_Tactical_Machine_Pistol.price;
            default:
                return 0;
        }
    }
    private static float getPriceAmmo(WeaponsType subMachineGunType){
        switch (subMachineGunType){
            case ES_C90: return FN_P90.priceAmmo;
            case KM_SUB_MACHINE_GUN: return HK_MP5_Navy.priceAmmo;
            case KM_UMP45: return HK_UMP45.priceAmmo;
            case INGRAM_MAC_10: return Ingram_MAC_10.priceAmmo;
            case SCHMIDT_MACHINE_PISTOL: return Steyr_Tactical_Machine_Pistol.priceAmmo;
            default:
                return 0;
        }
    }
    private static int getBaseCapacity(WeaponsType subMachineGunType){
        switch (subMachineGunType){
            case ES_C90: return FN_P90.baseCapacity;
            case KM_SUB_MACHINE_GUN: return HK_MP5_Navy.baseCapacity;
            case KM_UMP45: return HK_UMP45.baseCapacity;
            case INGRAM_MAC_10: return Ingram_MAC_10.baseCapacity;
            case SCHMIDT_MACHINE_PISTOL: return Steyr_Tactical_Machine_Pistol.baseCapacity;
            default:
                return 0;
        }
    }
    private static int getExtraCapacity(WeaponsType subMachineGunType){
        switch (subMachineGunType){
            case ES_C90: return FN_P90.extraCapacity;
            case KM_SUB_MACHINE_GUN: return HK_MP5_Navy.extraCapacity;
            case KM_UMP45: return HK_UMP45.extraCapacity;
            case INGRAM_MAC_10: return Ingram_MAC_10.extraCapacity;
            case SCHMIDT_MACHINE_PISTOL: return Steyr_Tactical_Machine_Pistol.extraCapacity;
            default:
                return 0;
        }
    }
    private static float getDamage(WeaponsType subMachineGunType){
        switch (subMachineGunType){
            case ES_C90: return FN_P90.damage;
            case KM_SUB_MACHINE_GUN: return HK_MP5_Navy.damage;
            case KM_UMP45: return HK_UMP45.damage;
            case INGRAM_MAC_10: return Ingram_MAC_10.damage;
            case SCHMIDT_MACHINE_PISTOL: return Steyr_Tactical_Machine_Pistol.damage;
            default:
                return 0;
        }
    }
    private static float getSecondaryDamage(WeaponsType subMachineGunType){
        switch (subMachineGunType){
            case ES_C90: return FN_P90.secondaryDamage;
            case KM_SUB_MACHINE_GUN: return HK_MP5_Navy.secondaryDamage;
            case KM_UMP45: return HK_UMP45.secondaryDamage;
            case INGRAM_MAC_10: return Ingram_MAC_10.secondaryDamage;
            case SCHMIDT_MACHINE_PISTOL: return Steyr_Tactical_Machine_Pistol.secondaryDamage;
            default:
                return 0;
        }
    }
}
