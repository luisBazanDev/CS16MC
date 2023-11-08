package pe.bazan.luis.plugins.cs16mc.domain.items.weapons.machinegun;

public interface FN_M249_Para {
    static String name = "ES M249 Para";
    static String type = "machinegun"; // Tipo de arma para la tienda: melee / pistol / shotgun / submachine gun / assult / sniper
    static String side = "all"; // para que bando es counter-terrorist / terrorist / all
    static float price =5750; // Precio del arma
    static float priceAmmo = 60; // Precio de la mulicion
    static int baseCapacity = 100;
    static int extraCapacity = 200;
    static float damage = 32;
    static float secondaryDamage = 0;
}
