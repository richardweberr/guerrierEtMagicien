package com.warlords;


public class Warrior extends Warlord {

    //  attributes
    private Weapon weapon;
    private String shield;


    //  mutator
    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
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
        this.setWeapon(weapon);
        this.setShield("bouclier");
    }

    public Warrior(String name) {
        super(name);
        this.setWeapon(weapon);
        this.setShield("bouclier");
    }

    public Warrior(String name, String image, int lifeLevel, int attackPower, Weapon weapon, String shield) {
        super(name, image, lifeLevel, attackPower);
        this.setWeapon(weapon);
        this.setShield(shield);
    }


    //methods
    public String printClassInfo() {
        return (
                "Vous avez la classe de Guerrier"
        );
    }

    public String printNameInfo() {
        return (
                "Nom de votre personnage: " + this.getName() + "\n" +
                        "Image de votre personnage: " + this.getImage()
        );
    }

    public String printAttributeInfo() {
        return (
                "Niveau de vie votre personnage: " + this.getLifeLevel() + "\n" +
                        "Force d'attaque de votre personnage: " + this.getAttackPower()
        );
    }

    public String printWeaponInfo() {
        return (
                "Votre arme s'appelle: " + this.getWeapon().getName() + " et est de niveau: " + this.getWeapon().getLevel() + "\n" +
                        "Votre bouclier s'appelle: " + this.getShield()
        );
    }
}