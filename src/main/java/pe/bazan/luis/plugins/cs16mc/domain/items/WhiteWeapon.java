package pe.bazan.luis.plugins.cs16mc.domain.items;

import pe.bazan.luis.plugins.cs16mc.domain.enums.WeaponsType;
import pe.bazan.luis.plugins.cs16mc.domain.items.weapons.whiteweapon.Knife;

public class WhiteWeapon extends WeaponCarrier implements Knife {
    private static WeaponsType whiteWeapon;
    public WhiteWeapon(WeaponsType whiteWeapon) {
        super(Knife.name,Knife.price,Knife.damage,Knife.secondaryDamage);
    }

    public void attack(){}

    @Override
    public void onClickRight() {

    }

    @Override
    public void onClickLeft() {

    }

    @Override
    public void onEquip() {

    }
}
