package com.warlords;


public class Magician extends Warlord{

    //  attributes
    private Weapon spell;
    private String potion;


    //  constructor

    public Magician() {
    }

    public Magician(String name) {
        super(name);
    }

    public Magician(String name, String image, int lifeLevel, int attackPower, Weapon spell, String potion) {
        super(name, image, lifeLevel, attackPower);
        this.spell = spell;
        this.potion = potion;
    }
}
