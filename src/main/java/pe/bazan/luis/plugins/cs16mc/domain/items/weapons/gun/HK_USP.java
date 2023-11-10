package pe.bazan.luis.plugins.cs16mc.domain.items.weapons.gun;

public interface HK_USP {
    static String name = "K&M .45 Tactical";
    static String type = "Pistol"; // Tipo de arma para la tienda: melee / pistol / shotgun / submachine gun / assult / sniper
    static String side = "all"; // para que bando es counter-terrorist / terrorist / all
    static float price = 500; // Precio del arma
    static float priceAmmo = 25; // Precio de la muinicion
    static int baseCapacity = 12;
    static int extraCapacity = 100;
    static float damage = 34;
    static float secondaryDamage = 30;
}
