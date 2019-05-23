package com.warlords;


public class Magician extends Warlord {

    //  attributes
    private final int MINLIFELVL = 3;
    private final int MAXLIFELVL = 6;
    private final int MINATTACKPOWER = 8;
    private final int MAXATTACKPOWER = 15;


    //  mutator
    public int getMINLIFELVL() {
        return MINLIFELVL;
    }

    public int getMAXLIFELVL() {
        return MAXLIFELVL;
    }

    public int getMINATTACKPOWER() {
        return MINATTACKPOWER;
    }

    public int getMAXATTACKPOWER() {
        return MAXATTACKPOWER;
    }

    @Override
    public void setLifeLevel(int lifeLevel) {
        if (lifeLevel <= this.getMINLIFELVL()) {
            lifeLevel = this.getMINLIFELVL();
            super.setLifeLevel(lifeLevel);
        }
        if (lifeLevel >= this.getMAXLIFELVL()) {
            lifeLevel = this.getMAXLIFELVL();
            super.setLifeLevel(lifeLevel);
        }
    }

    @Override
    public void setAttackPower(int attackPower) {
        if (attackPower <= this.getMINATTACKPOWER()) {
            attackPower = this.getMAXATTACKPOWER();
            super.setAttackPower(attackPower);
        }
        if (attackPower >= this.getMAXATTACKPOWER()) {
            attackPower = this.getMAXATTACKPOWER();
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
    public Magician() {
    }

    public Magician(String name) {
        super(name);
    }

    public Magician(String name, String image, int lifeLevel, int attackPower, Attack attack, Defense defense) {
        super(name, image, lifeLevel, attackPower, attack, defense);
    }


    //methods
    @Override
    public String toString() {
        return "Vous avez la classe de Magicien\n" +
                super.toString() + "\n" +
                "Votre sort " + this.getAttack().getName() + " est de niveau " + this.getAttack().getLevel() + "\n" +
                "Votre philtre s'appelle " + this.getDefense().getName() + "\n";
    }
}