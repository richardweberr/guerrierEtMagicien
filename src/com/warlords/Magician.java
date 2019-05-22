package com.warlords;


public class Magician extends Warlord {

    //  attributes


    //  mutator
    @Override
    public Attack getAttack() {
        return this.attack;
    }

    @Override
    public void setAttack(Attack attack) {
        this.attack = new Spell();
    }

    @Override
    public Defense getDefense() {
        return this.defense;
    }

    @Override
    public void setDefense(Defense defense) {
        this.defense = new Potion();
    }


    //  constructor
    public Magician() {
    }

    public Magician(String name) {
        super(name);
    }

    public Magician(String name, String image, int lifeLevel, int attackPower, Attack attack, Defense defense) {
        super(name, image, lifeLevel, attackPower, attack, defense);
    }


    //methods
    public String toString() {
        return "Vous avez la classe de Magicien\n" +
                super.toString() + "\n" +
                "Votre sort " + this.getAttack().getName() + " est de niveau " + this.getAttack().getLevel() + "\n" +
                "Votre philtre s'appelle " + this.getDefense().getName() + "\n";
    }

}