package pe.bazan.luis.plugins.cs16mc.domain.items;



public class BaseItem  {


// Verifica que Clase es, antes de ser llamado por la clase eventos
    public void onClick(){
    if(this instanceof FireArms){
        FireArms fireArms = (FireArms) this;
    } else if (this instanceof WhiteWeapon) {
        WhiteWeapon whiteWeapon = (WhiteWeapon) this;
    } else if (this instanceof Grenade) {
        Grenade grenade= (Grenade) this;
    }
    }
    public void onClickLeft(){
    }
    public void onEquip(){

    }

}