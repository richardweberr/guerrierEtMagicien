package com.warlords;


public class Weapon extends Attack {

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