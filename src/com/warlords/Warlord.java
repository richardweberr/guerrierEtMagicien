package com.warlords;


public class Warlord {

    //  attributes
    private String name;
    private String image;
    private int lifeLevel;
    private int attackPower;

    //  mutator


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getLifeLevel() {
        return lifeLevel;
    }

    public void setLifeLevel(int lifeLevel) {
        this.lifeLevel = lifeLevel;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }

    //  constructor
    public Warlord() {
        this.name = "Nom";
        this.image = "image";
        this.lifeLevel = 3;
        this.attackPower = 8;
    }

    public Warlord(String name) {
        this.name = name;
        this.image = "image";
        this.lifeLevel = 3;
        this.attackPower = 8;
    }

    public Warlord(String name, String image, int lifeLevel, int attackPower) {
        this.name = name;
        this.image = image;
        this.lifeLevel = lifeLevel;
        this.attackPower = attackPower;
    }
}
