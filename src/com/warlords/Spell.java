package com.warlords;


public class Spell extends Attack {

    //  constructor
    public Spell() {
    }

    public Spell(String name) {
        super(name);
    }

    public Spell(String name, int level) {
        super(name, level);
    }
}