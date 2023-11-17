package pe.bazan.luis.plugins.cs16mc.domain.items.weapons.whiteweapon;

public interface Knife {
    static String name = "Knife";
    static String type = "Melee"; // Tipo de arma para la tienda: melee / pistol / shotgun / submachine gun / assult / sniper
    static String side = "all"; // para que bando es counter-terrorist / terrorist / all
    static float price = 0; // Precio del arma
    static float damage = 20;
    static float secondaryDamage = 65;
}
