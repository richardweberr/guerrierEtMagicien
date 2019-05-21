package com.warlords;


public class Warrior extends Warlord {

    //  attributes


    //  mutator
    @Override
    public Attack getAttack() {
        return this.attack;
    }

    @Override
    public void setAttack(Attack attack) {
        this.attack = new Weapon();
    }

    @Override
    public Defense getDefense() {
        return this.defense;
    }

    @Override
    public void setDefense(Defense defense) {
        this.defense = new Shield();
    }


    //  constructor
    public Warrior() {
    }

    public Warrior(String name) {
        super(name);
    }

    public Warrior(String name, String image, int lifeLevel, int attackPower, Attack attack, Defense defense) {
        super(name, image, lifeLevel, attackPower, attack, defense);
    }

    //methods
    public String toString() {
        return "Vous avez la classe de Guerrier";
    }
}