package pe.bazan.luis.plugins.cs16mc.domain.items.weapons.rifle.assault;

public interface Clarion {
    static String name = "Clarion 5.56";
    static String type = "assault rifle"; // Tipo de arma para la tienda: melee / pistol / shotgun / submachine gun / assult / sniper
    static String side = "counter-terrorist"; // para que bando es counter-terrorist / terrorist / all
    static float price =2250; // Precio del arma
    static float priceAmmo = 60; // Precio de la mulicion
    static int baseCapacity = 25;
    static int extraCapacity = 90;
    static float damage = 30;
    static float secondaryDamage = 34;
}
