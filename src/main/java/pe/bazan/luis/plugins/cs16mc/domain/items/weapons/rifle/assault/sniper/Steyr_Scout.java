package pe.bazan.luis.plugins.cs16mc.domain.items.weapons.rifle.assault.sniper;

public interface Steyr_Scout {
    static String name = "Schmidt Scout";
    static String type = "sniper rifle"; // Tipo de arma para la tienda: melee / pistol / shotgun / submachine gun / assult / sniper
    static String side = "all"; // para que bando es counter-terrorist / terrorist / all
    static float price = 2750; // Precio del arma
    static float priceAmmo = 80; // Precio de la mulicion
    static int baseCapacity = 10;
    static int extraCapacity = 90;
    static float damage = 75;
    static float secondaryDamage = 0;
}
