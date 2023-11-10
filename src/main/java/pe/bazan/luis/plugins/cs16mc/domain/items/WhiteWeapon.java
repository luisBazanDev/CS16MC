package pe.bazan.luis.plugins.cs16mc.domain.items;

import pe.bazan.luis.plugins.cs16mc.domain.items.weapons.whiteweapon.Knife;

public class WhiteWeapon extends WeaponCarrier implements Knife {

    public WhiteWeapon(float price, float damage) {
        super(price, damage);
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
