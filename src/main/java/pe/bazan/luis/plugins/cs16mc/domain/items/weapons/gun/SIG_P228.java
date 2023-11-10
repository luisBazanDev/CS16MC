package pe.bazan.luis.plugins.cs16mc.domain.items.weapons.gun;

public interface SIG_P228 {
    static String name = "228 Compact";
    static String type = "Pistol"; // Tipo de arma para la tienda: melee / pistol / shotgun / submachine gun / assult / sniper
    static String side = "all"; // para que bando es counter-terrorist / terrorist / all
    static float price = 600; // Precio del arma
    static float priceAmmo = 50; // Precio de la municion
    static int baseCapacity = 13;
    static int extraCapacity = 52;
    static float damage = 32;
    static float secondaryDamage = 0;
}
