package pe.bazan.luis.plugins.cs16mc.domain.items.weapons.submachinegun;

public interface FN_P90 {
    static String name = "ES C90";
    static String type = "submachinegun"; // Tipo de arma para la tienda: melee / pistol / shotgun / submachine gun / assult / sniper
    static String side = "all"; // para que bando es counter-terrorist / terrorist / all
    static float price =2350; // Precio del arma
    static float priceAmmo = 50; // Precio de la mulicion
    static int baseCapacity = 50;
    static int extraCapacity = 100;
    static float damage = 21;
    static float secondaryDamage = 0;
}
