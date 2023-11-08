package pe.bazan.luis.plugins.cs16mc.domain.items.weapons.rifle.assault.sniper;

public interface Magnum {
    static String name = "Magnum Sniper Rifle";
    static String type = "sniper rifle"; // Tipo de arma para la tienda: melee / pistol / shotgun / submachine gun / assult / sniper
    static String side = "all"; // para que bando es counter-terrorist / terrorist / all
    static float price =4750; // Precio del arma
    static float priceAmmo =125; // Precio de la mulicion
    static int baseCapacity = 10;
    static int extraCapacity = 30;
    static float damage = 115;
    static float secondaryDamage = 0;
}
