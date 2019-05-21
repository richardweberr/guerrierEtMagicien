package com.warlords;


public abstract class Defense {

    //attribute
    private String name;


    //mutator
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    //constructor
    public Defense() {
        name = "Nom";
    }

    public Defense(String name) {
        this.setName(name);
    }

    public String printWeaponInfo() {
        return "Votre bouclier s'appelle: " + this.getName();
    }
}
