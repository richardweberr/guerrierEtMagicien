package com.warlords;

import java.util.Scanner;


public class ShowMenu {

    private int showMenu = 1;
    private Scanner sc = new Scanner(System.in);


    public int getShowMenu() {
        return showMenu;
    }

    public void setShowMenu(int showMenu) {
        this.showMenu = showMenu;
    }


    public void mainMenu() {

        while (showMenu == 1) {
            System.out.println("Saississez au clavier les numéros des lignes correspondant à vos choix \n" +
                    "1. Voir tous les personnages crées\n" +
                    "2. Choisir un personnage\n" +
                    "3. Créer un personnage\n" +
                    "4. Supprimer un personnage\n" +
                    "5. Quitter");
            String menuChoice = this.sc.nextLine();

            while (!menuChoice.equals("1") && !menuChoice.equals("2") && !menuChoice.equals("3") && !menuChoice.equals("4") && !menuChoice.equals("5")) {
                System.out.println("1, 2, 3, 4 ou 5");
                menuChoice = this.sc.nextLine();
            }
            switch (menuChoice) {
                case ("1"):
                    this.listCharacter();
                    break;
                case ("2"):
                    this.chooseCharacter();
                    break;
                case ("3"):
                    this.createWarlord();
                    break;
                case ("4"):
                    this.deleteCharacter();
                    break;
                case ("5"):
                    setShowMenu(0);
                    System.out.println("bye");
                    break;
                default:
            }
        }
    }

    public void listCharacter() {

    }

    public void chooseCharacter() {

    }

    public void displayWarriorInfo(Warrior warrior) {
        System.out.println(warrior.printClassInfo());
        System.out.println(warrior.printNameInfo());
        System.out.println(warrior.printAttributeInfo());
        System.out.println(warrior.printWeaponInfo());
    }

    public void displayMagicianInfo(Magician magician) {
        System.out.println(magician.printClassInfo());
        System.out.println(magician.printNameInfo());
        System.out.println(magician.printAttributeInfo());
        System.out.println(magician.printSpellInfo());
    }

    public void createWarlord() {
        System.out.println("Voulez-vous créer:\n 1. Un guerrier\n 2. Un magicien\n");
        String classChoice = this.sc.nextLine();
        while (!classChoice.equals("1") && !classChoice.equals("2")) {
            System.out.println("1 ou 2");
            classChoice = this.sc.nextLine();
        }
        switch (classChoice) {
            case ("1"):
                createWarrior();
                break;
            case ("2"):
                createMagician();
                break;
            default:
        }
    }

    public void createWarrior() {
        System.out.println("Entrez le nom de votre Guerrier");
        String name = this.sc.nextLine();
        System.out.println("Entrez l'URL de l'image  de votre Guerrier");
        String image = this.sc.nextLine();
        System.out.println("Entrez le niveau de vie de votre Guerrier");
        int lifeLevel = this.sc.nextInt();
        this.sc.nextLine();
        System.out.println("Entrez la force d'attaque de votre Guerrier");
        int attackPower = this.sc.nextInt();
        this.sc.nextLine();
        System.out.println("Entrez le nom de votre arme");
        String weaponName = this.sc.nextLine();
        System.out.println("Entrez le niveau de votre arme");
        int weaponLevel = this.sc.nextInt();
        this.sc.nextLine();
        System.out.println("Entrez le nom de votre bouclier");
        String shieldName = this.sc.nextLine();

        Weapon weapon = new Weapon(weaponName, weaponLevel);
        Warrior warrior = new Warrior(name, image, lifeLevel, attackPower, weapon, shieldName);

        this.displayWarriorInfo(warrior);
    }

    public void createMagician() {
        System.out.println("Entrez le nom de votre Magicien");
        String name = this.sc.nextLine();
        System.out.println("Entrez l'URL de l'image  de votre Magicien");
        String image = this.sc.nextLine();
        System.out.println("Entrez le niveau de vie de votre Magicien");
        int lifeLevel = this.sc.nextInt();
        this.sc.nextLine();
        System.out.println("Entrez la force d'attaque de votre Magicien");
        int attackPower = this.sc.nextInt();
        this.sc.nextLine();
        System.out.println("Entrez le nom de votre sort");
        String spellName = this.sc.nextLine();
        System.out.println("Entrez le niveau de votre sort");
        int spellLevel = this.sc.nextInt();
        this.sc.nextLine();
        System.out.println("Entrez le nom de votre philtre");
        String potionName = this.sc.nextLine();

        Spell spell = new Spell(spellName, spellLevel);
        Magician magician = new Magician(name, image, lifeLevel, attackPower, spell, potionName);

        this.displayMagicianInfo(magician);
    }

    public void deleteCharacter() {

    }
}
