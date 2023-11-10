package pe.bazan.luis.plugins.cs16mc.domain.items.weapons.rifle.assault.sniper;

public interface SG_1_Sniper_Rifle {
    static String name = "D3/AU-1 Semi-Auto Sniper Rifle";
    static String type = "sniper rifle"; // Tipo de arma para la tienda: melee / pistol / shotgun / submachine gun / assult / sniper
    static String side = "terrorist"; // para que bando es counter-terrorist / terrorist / all
    static float price = 5000; // Precio del arma
    static float priceAmmo = 80; // Precio de la mulicion
    static int baseCapacity = 20;
    static int extraCapacity = 90;
    static float damage = 80;
    static float secondaryDamage = 0;
}
