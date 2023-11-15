package pe.bazan.luis.plugins.cs16mc.domain.items.weapons.gun;

public interface Desert_Eagle {
    static String name = "Night Hawk .50C";
    static String type = "Pistol"; // Tipo de arma para la tienda: melee / pistol / shotgun / submachine gun / assult / sniper
    static String side = "all"; // para que bando es counter-terrorist / terrorist / all
    static float price = 650; // Precio del arma
    static float priceAmmo = 40; // Precio de la municion
    static int baseCapacity = 7;
    static int extraCapacity = 35;
    static float damage = 54;
    static float secondaryDamage = 0;
}

