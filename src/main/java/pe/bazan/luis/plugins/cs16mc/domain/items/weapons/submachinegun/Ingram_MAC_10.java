package pe.bazan.luis.plugins.cs16mc.domain.items.weapons.submachinegun;

public interface Ingram_MAC_10 {
    static String name = "Ingram MAC-10";
    static String type = "submachinegun"; // Tipo de arma para la tienda: melee / pistol / shotgun / submachine gun / assult / sniper
    static String side = "terrorist"; // para que bando es counter-terrorist / terrorist / all
    static float price = 1400; // Precio del arma
    static float priceAmmo = 25; // Precio de la mulicion
    static int baseCapacity = 30;
    static int extraCapacity = 100;
    static float damage = 29;
    static float secondaryDamage = 0;
}
