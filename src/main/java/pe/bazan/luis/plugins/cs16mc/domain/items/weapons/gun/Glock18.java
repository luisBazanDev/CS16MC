package pe.bazan.luis.plugins.cs16mc.domain.items.weapons.gun;

public interface Glock18 {
    static String name = "";
    static String type = ""; // Tipo de arma para la tienda: melee / pistol / shotgun / submachine gun / assult / sniper
    static String side = "all"; // para que bando es counter-terrorist / terrorist / all
    static float price = 12; // Precio del arma
    static float priceAmmo = 2; // Precio de la municion
    static int baseCapacity = 30;
    static int extraCapacity = 30;
    static float damage = 10;
    static float secondaryDamage = 5;

}
