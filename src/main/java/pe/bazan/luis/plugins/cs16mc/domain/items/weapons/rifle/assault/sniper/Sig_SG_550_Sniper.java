package pe.bazan.luis.plugins.cs16mc.domain.items.weapons.rifle.assault.sniper;

public interface Sig_SG_550_Sniper {
    static String name = "Krieg 550 Commando";
    static String type = "sniper rifle"; // Tipo de arma para la tienda: melee / pistol / shotgun / submachine gun / assult / sniper
    static String side = "counter-terrorist"; // para que bando es counter-terrorist / terrorist / all
    static float price = 4200; // Precio del arma
    static float priceAmmo = 60; // Precio de la mulicion
    static int baseCapacity = 30;
    static int extraCapacity = 90;
    static float damage = 70;
    static float secondaryDamage = 0;
}
