package pe.bazan.luis.plugins.cs16mc.domain.items.weapons.shotguns;

public interface Benelli_XM1014 {
    static String name = "Leone YG1265 Auto Shotgun";
    static String type = "shotgun"; // Tipo de arma para la tienda: melee / pistol / shotgun / submachine gun / assult / sniper
    static String side = "all"; // para que bando es counter-terrorist / terrorist / all
    static float price = 3000; // Precio del arma
    static float priceAmmo = 65; // Precio de la mulicion
    static int baseCapacity = 7;
    static int extraCapacity = 32;
    static float damage = 120;
    static float secondaryDamage = 0;
}
