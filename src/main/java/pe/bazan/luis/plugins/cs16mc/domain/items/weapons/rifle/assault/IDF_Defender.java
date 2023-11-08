package pe.bazan.luis.plugins.cs16mc.domain.items.weapons.rifle.assault;

public interface IDF_Defender {
    static String name = "IDF Defender";
    static String type = "assault rifle"; // Tipo de arma para la tienda: melee / pistol / shotgun / submachine gun / assult / sniper
    static String side = "terrorist"; // para que bando es counter-terrorist / terrorist / all
    static float price =2000; // Precio del arma
    static float priceAmmo = 60; // Precio de la mulicion
    static int baseCapacity = 35;
    static int extraCapacity = 90;
    static float damage = 30;
    static float secondaryDamage = 0;
}
