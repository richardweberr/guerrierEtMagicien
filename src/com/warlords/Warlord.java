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
        this.setName("Nom");
        this.setImage("Image");
        this.setLifeLevel(5);
        this.setAttackPower(8);
    }

    public Warlord(String name) {
        this.setName(name);
        this.setImage("Image");
        this.setLifeLevel(5);
        this.setAttackPower(8);
    }

    public Warlord(String name, String image, int lifeLevel, int attackPower) {
        this.setName(name);
        this.setImage(image);
        this.setLifeLevel(lifeLevel);
        this.setAttackPower(attackPower);
    }


    //methods
    public String printNameInfo() {
        return (
                "Nom de votre personnage: " + this.getName() + "\n" +
                        "Image de votre personnage: " + this.getImage()
        );
    }
    public String printAttibuteInfo() {
        return (
                "Niveau de vie votre personnage: " + this.getLifeLevel() + "\n" +
                        "Force d'attaque de votre personnage: " + this.getAttackPower()
        );
    }
}