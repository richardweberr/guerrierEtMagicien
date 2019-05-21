package com.warlords;


public class Warrior extends Warlord {

    //  attributes
    private Weapon weapon;
    private String shield;


    //  mutator
    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(String weaponName, int weaponLevel) {
        this.weapon = new Weapon(weaponName, weaponLevel);
    }

    public String getShield() {
        return shield;
    }

    public void setShield(String shield) {
        this.shield = shield;
    }


    //  constructor
    public Warrior() {
        super();
        this.setWeapon("épée", 1);
        this.setShield("bouclier");
    }

    public Warrior(String name) {
        super(name);
        this.setWeapon("épée", 1);
        this.setShield("bouclier");
    }

    public Warrior(String name, String image, int lifeLevel, int attackPower, Weapon weapon, String shield) {
        super(name, image, lifeLevel, attackPower);
        this.setWeapon(weapon.getName(), weapon.getLevel());
        this.setShield(shield);
    }

//    public Warrior(String name, String image, int lifeLevel, int attackPower, String  weaponName, int weaponLevel, String shield) {
//        super(name, image, lifeLevel, attackPower);
//        this.setWeapon(weaponName, weaponLevel);
//        this.setShield("bouclier");
//    }


    //methods
    public String printClassInfo() {
        return (
                "Vous avez la classe de Guerrier"
        );
    }

    public String printWeaponInfo() {
        return (
                "Votre arme s'appelle: " + this.getWeapon().getName() + " et est de niveau: " + this.getWeapon().getLevel() + "\n" +
                        "Votre bouclier s'appelle: " + this.getShield()
        );
    }
}