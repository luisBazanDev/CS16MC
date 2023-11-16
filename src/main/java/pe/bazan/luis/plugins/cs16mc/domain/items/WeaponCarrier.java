package pe.bazan.luis.plugins.cs16mc.domain.items;

public abstract class WeaponCarrier extends BaseItem{
    String name;
    float price;
    float damage;
    float secondaryDamage;



    public WeaponCarrier(String name, float price, float damage, float secondaryDamage) {
        this.price = price;
        this.damage = damage;
        this.secondaryDamage= secondaryDamage;
        this.name = name;

    }


}
