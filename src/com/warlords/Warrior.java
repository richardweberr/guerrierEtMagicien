package com.warlords;


public class Warrior extends Warlord {

    //  attributes
    private static final int MINLIFELEVEL = 5;
    private static final int MAXLIFELEVEL = 10;
    private static final int MINATTACKPOWER = 5;
    private static final int MAXATTACKPOWER = 10;


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
        }
        if (lifeLevel >= getMAXLIFELEVEL()) {
            lifeLevel = getMAXLIFELEVEL();
        }
        super.setLifeLevel(lifeLevel);
    }

    @Override
    public void setAttackPower(int attackPower) {
        if (attackPower <= getMINATTACKPOWER()) {
            attackPower = getMINATTACKPOWER();
        }
        if (attackPower >= getMAXATTACKPOWER()) {
            attackPower = getMAXATTACKPOWER();
        }
        super.setAttackPower(attackPower);
    }

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
    public Warrior(String name, String image, int lifeLevel, int attackPower) {
        super(name, image, lifeLevel, attackPower);
        this.attack = new Weapon();
        this.defense = new Shield();
    }

    public Warrior(String name, String image, int lifeLevel, int attackPower, Attack attack, Defense defense) {
        super(name, image, lifeLevel, attackPower, attack, defense);
    }


    //  methods
    @Override
    public String toString() {
        return "Vous avez la classe de Guerrier\n" +
                super.toString() + "\n" +
                "Votre arme " + this.getAttack().getName() + " est de niveau " + this.getAttack().getLevel() + "\n" +
                "Votre bouclier s'appelle " + this.getDefense().getName() + "\n";
    }
}