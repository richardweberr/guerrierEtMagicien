package com.warlords;


public class Magician extends Warlord {

    //  attributes
    private static final int MINLIFELEVEL = 3;
    private static final int MAXLIFELEVEL = 6;
    private static final int MINATTACKPOWER = 8;
    private static final int MAXATTACKPOWER = 15;


    //  mutator
    public static int getMINLIFELEVEL() {
        return MINLIFELEVEL;
    }

    public static int getMAXLIFELEVEL() {
        return MAXLIFELEVEL;
    }

    public static int getMINATTACKPOWER() {
        return MINATTACKPOWER;
    }

    public static int getMAXATTACKPOWER() {
        return MAXATTACKPOWER;
    }

    @Override
    public void setLifeLevel(int lifeLevel) {
        if (lifeLevel <= getMINLIFELEVEL()) {
            lifeLevel = getMINLIFELEVEL();
            super.setLifeLevel(lifeLevel);
        }
        if (lifeLevel >= getMAXLIFELEVEL()) {
            lifeLevel = getMAXLIFELEVEL();
            super.setLifeLevel(lifeLevel);
        }
    }

    @Override
    public void setAttackPower(int attackPower) {
        if (attackPower <= getMINATTACKPOWER()) {
            attackPower = getMAXATTACKPOWER();
            super.setAttackPower(attackPower);
        }
        if (attackPower >= getMAXATTACKPOWER()) {
            attackPower = getMAXATTACKPOWER();
            super.setAttackPower(attackPower);
        }
    }

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
    public Magician(String name, String image, int lifeLevel, int attackPower, Attack attack, Defense defense) {
        super(name, image, lifeLevel, attackPower, attack, defense);
    }


    //  methods
    @Override
    public String toString() {
        return "Vous avez la classe de Magicien\n" +
                super.toString() + "\n" +
                "Votre sort " + this.getAttack().getName() + " est de niveau " + this.getAttack().getLevel() + "\n" +
                "Votre philtre s'appelle " + this.getDefense().getName() + "\n";
    }
}