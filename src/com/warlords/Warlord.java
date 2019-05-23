package com.warlords;


public abstract class Warlord {

    //  attributes
    private String name;
    private String image;
    private int lifeLevel;
    private int attackPower;
    protected Attack attack;
    protected Defense defense;


    //  mutator
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getLifeLevel() {
        return lifeLevel;
    }

    public void setLifeLevel(int lifeLevel) {
        this.lifeLevel = lifeLevel;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }

    public abstract Attack getAttack();

    public abstract void setAttack(Attack attack);

    public abstract Defense getDefense();

    public abstract void setDefense(Defense defense);


    //  constructor
    public Warlord() {
    }

    public Warlord(String name) {
        this.name = name;
    }

    public Warlord(String name, String image, int lifeLevel, int attackPower, Attack attack, Defense defense) {
        this.name = name;
        this.image = image;
        this.lifeLevel = lifeLevel;
        this.attackPower = attackPower;
        this.attack = attack;
        this.defense = defense;
    }


    //methods
    public String toString() {
        return "Nom de votre personnage: " + this.getName() + "\n" +
                "Image de votre personnage: " + this.getImage() + "\n" +
                "Niveau de vie votre personnage: " + this.getLifeLevel() + "\n" +
                "Force d'attaque de votre personnage: " + this.getAttackPower();
    }
}