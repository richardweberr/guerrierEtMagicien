package com.warlords;


public class Warrior extends Warlord{

    //  attributes
    private Weapon weapon;
    private String shield;


    //  constructor

    public Warrior() {
        super();
    }
    public Warrior(String name) {
        super(name);
    }
    public Warrior(String name, String image, int lifeLevel, int attackPower, Weapon weapon, String shield) {
        super(name, image, lifeLevel, attackPower);
        this.weapon = weapon;
        this.shield = shield;
    }
}
