package pe.bazan.luis.plugins.cs16mc.domain.items.weapons.submachinegun;

public interface HK_UMP45 {
    static String name = "K&M UMP45";
    static String type = "submachinegun"; // Tipo de arma para la tienda: melee / pistol / shotgun / submachine gun / assult / sniper
    static String side = "all"; // para que bando es counter-terrorist / terrorist / all
    static float price = 1700; // Precio del arma
    static float priceAmmo = 25; // Precio de la mulicion
    static int baseCapacity = 25;
    static int extraCapacity = 100;
    static float damage = 30;
    static float secondaryDamage = 0;
}
