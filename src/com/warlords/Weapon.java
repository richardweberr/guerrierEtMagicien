package com.warlords;


public class Weapon extends Attack {

    //  attributes
    private static final int MINLEVEL = 1;
    private static final int MAXLEVEL = 10;


    //  mutator
    public static int getMINLEVEL() {
        return MINLEVEL;
    }

    public static int getMAXLEVEL() {
        return MAXLEVEL;
    }

    @Override
    public void setLevel(int level) {
        if (level <= getMINLEVEL()) {
            level = getMINLEVEL();
            super.setLevel(level);
        }
        if (level >= getMAXLEVEL()) {
            level = getMAXLEVEL();
            super.setLevel(level);
        }
    }


    //  constructor
    public Weapon() {
    }

    public Weapon(String name) {
        super(name);
    }

    public Weapon(String name, int level) {
        super(name, level);
    }
}