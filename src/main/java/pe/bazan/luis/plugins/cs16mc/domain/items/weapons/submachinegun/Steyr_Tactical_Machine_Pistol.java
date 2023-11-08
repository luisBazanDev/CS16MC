package pe.bazan.luis.plugins.cs16mc.domain.items.weapons.submachinegun;

public interface Steyr_Tactical_Machine_Pistol {
    static String name = "Schmidt Machine Pistol";
    static String type = "submachinegun"; // Tipo de arma para la tienda: melee / pistol / shotgun / submachine gun / assult / sniper
    static String side = "counter-terrorist"; // para que bando es counter-terrorist / terrorist / all
    static float price =1250; // Precio del arma
    static float priceAmmo = 20; // Precio de la mulicion
    static int baseCapacity = 30;
    static int extraCapacity = 120;
    static float damage = 20;
    static float secondaryDamage = 0;
}
