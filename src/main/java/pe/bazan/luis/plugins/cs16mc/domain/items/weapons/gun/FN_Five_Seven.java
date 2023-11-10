package pe.bazan.luis.plugins.cs16mc.domain.items.weapons.gun;

public interface FN_Five_Seven {
    static String name = "ES Five-Seven";
    static String type = "Pistol"; // Tipo de arma para la tienda: melee / pistol / shotgun / submachine gun / assult / sniper
    static String side = "counter-terrorist"; // para que bando es counter-terrorist / terrorist / all
    static float price = 750; // Precio del arma
    static float priceAmmo = 50; // Precio de la municion
    static int baseCapacity = 20;
    static int extraCapacity = 100;
    static float damage = 20;
    static float secondaryDamage = 0;
}
