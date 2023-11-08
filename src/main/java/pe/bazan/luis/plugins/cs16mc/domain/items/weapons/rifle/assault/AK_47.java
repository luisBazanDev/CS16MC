package pe.bazan.luis.plugins.cs16mc.domain.items.weapons.rifle.assault;

public interface AK_47 {
    static String name = "CV-47";
    static String type = "assault rifle"; // Tipo de arma para la tienda: melee / pistol / shotgun / submachine gun / assult / sniper
    static String side = "terrorist"; // para que bando es counter-terrorist / terrorist / all
    static float price =2500; // Precio del arma
    static float priceAmmo = 80; // Precio de la mulicion
    static int baseCapacity = 30;
    static int extraCapacity = 90;
    static float damage = 36;
    static float secondaryDamage = 0;
}

