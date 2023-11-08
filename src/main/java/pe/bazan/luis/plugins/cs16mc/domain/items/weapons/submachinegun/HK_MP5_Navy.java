package pe.bazan.luis.plugins.cs16mc.domain.items.weapons.submachinegun;

public interface HK_MP5_Navy {
    static String name = "K&M Sub-Machine Gun";
    static String type = "submachinegun"; // Tipo de arma para la tienda: melee / pistol / shotgun / submachine gun / assult / sniper
    static String side = "all"; // para que bando es counter-terrorist / terrorist / all
    static float price =1500; // Precio del arma
    static float priceAmmo = 20; // Precio de la mulicion
    static int baseCapacity = 30;
    static int extraCapacity = 120;
    static float damage = 26;
    static float secondaryDamage = 0;
}
