package pe.bazan.luis.plugins.cs16mc.domain.items.weapons.gun;

public interface Dual_Beretta_96G_Elite {
    static String name = ".40 Dual Elites";
    static String type = "Pistol"; // Tipo de arma para la tienda: melee / pistol / shotgun / submachine gun / assult / sniper
    static String side = "terrorist"; // para que bando es counter-terrorist / terrorist / all
    static float price =800; // Precio del arma
    static float priceAmmo = 20; // Precio de la municion
    static int baseCapacity =30;
    static int extraCapacity =120;
    static float damage =36;
    static float secondaryDamage = 0;
}
