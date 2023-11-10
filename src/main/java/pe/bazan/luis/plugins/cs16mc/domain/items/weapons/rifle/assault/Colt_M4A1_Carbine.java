package pe.bazan.luis.plugins.cs16mc.domain.items.weapons.rifle.assault;

public interface Colt_M4A1_Carbine {
    static String name = "Maverick M4A1 Carbine";
    static String type = "assault rifle"; // Tipo de arma para la tienda: melee / pistol / shotgun / submachine gun / assult / sniper
    static String side = "counter-terrorist"; // para que bando es counter-terrorist / terrorist / all
    static float price = 3100; // Precio del arma
    static float priceAmmo = 60; // Precio de la mulicion
    static int baseCapacity = 30;
    static int extraCapacity = 90;
    static float damage = 32;
    static float secondaryDamage = 33;
}
