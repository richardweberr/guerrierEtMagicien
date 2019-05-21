package com.warlords;


public class Attack {

    //  attributes
    private String name;
    private int level;


    //  mutator
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }


    //  constructor
    public Attack() {
        this.name = "attaque";
        this.level = 1;
    }

    public Attack(String name) {
        this.name = name;
        this.level = 1;
    }

    public Attack(String name, int level) {
        this.name = name;
        this.level = level;
    }
}

