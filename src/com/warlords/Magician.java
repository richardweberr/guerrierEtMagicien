package com.warlords;


public class Magician extends Warlord {

    //  attributes
    private Spell spell;
    private String potion;


    //  mutator
    public Spell getSpell() {
        return spell;
    }

    public void setSpell(String spellName, int spellLevel) {
        this.spell = new Spell(spellName, spellLevel);
    }

    public String getPotion() {
        return potion;
    }

    public void setPotion(String potion) {
        this.potion = potion;
    }


    //  constructor
    public Magician() {
        super();
        this.setSpell("sort", 9);
        this.setPotion("Philtre");
    }

    public Magician(String name) {
        super(name);
        this.setSpell("sort", 9);
        this.setPotion("Philtre");
    }

    public Magician(String name, String image, int lifeLevel, int attackPower, Spell spell, String potion) {
        super(name, image, lifeLevel, attackPower);
//        this.setSpell(spell);
        this.setPotion(potion);
    }


    //methods
    public String printClassInfo() {
        return (
                "Vous avez la classe de Magicien"
        );
    }

    public String printNameInfo() {
        return (
                "Nom de votre personnage: " + this.getName() + "\n" +
                        "Image de votre personnage: " + this.getImage()
        );
    }

    public String printAttributeInfo() {
        return (
                "Niveau de vie votre personnage: " + this.getLifeLevel() + "\n" +
                        "Force d'attaque de votre personnage: " + this.getAttackPower()
        );
    }

    public String printSpellInfo() {
        return (
                "Votre Sort s'appelle: " + this.getSpell().getName() + " et est de niveau: " + this.getSpell().getLevel() + "\n" +
                        "Votre Potion s'appelle: " + this.getPotion()
        );
    }

}