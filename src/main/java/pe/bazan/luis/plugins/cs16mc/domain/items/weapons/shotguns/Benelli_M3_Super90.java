package pe.bazan.luis.plugins.cs16mc.domain.items.weapons.shotguns;

public interface Benelli_M3_Super90 {
    static String name = "Leone 12 Gauge Super";
    static String type = "shotgun"; // Tipo de arma para la tienda: melee / pistol / shotgun / submachine gun / assult / sniper
    static String side = "all"; // para que bando es counter-terrorist / terrorist / all
    static float price = 1700; // Precio del arma
    static float priceAmmo = 65; // Precio de la mulicion
    static int baseCapacity = 8;
    static int extraCapacity = 32;
    static float damage = 180;
    static float secondaryDamage = 0;
}
