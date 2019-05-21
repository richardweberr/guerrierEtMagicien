package com.warlords;

import java.util.Scanner;


public class MenuMain {

    //  attributes
    private int showMainMenu = 1;
    private int showCharacterMenu = 1;
    private Scanner sc = new Scanner(System.in);

    //mutator
    public int getShowMainMenu() {
        return showMainMenu;
    }

    public void setShowMainMenu(int showMenu) {
        this.showMainMenu = showMenu;
    }

    public int getShowCharacterMenu() {
        return showCharacterMenu;
    }

    public void setShowCharacterMenu(int showCharacterMenu) {
        this.showCharacterMenu = showCharacterMenu;
    }


    //methods
    public void mainMenu() {
        while (showMainMenu == 1) {
            System.out.println("\n\n" +
                    "Saississez au clavier les numéros des lignes correspondant à vos choix \n" +
                    "1. Voir tous les personnages crées\n" +
                    "2. Choisir un personnage\n" +
                    "3. Créer un personnage\n" +
                    "4. Supprimer un personnage\n" +
                    "5. Quitter"
            );
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
                    setShowMainMenu(0);
                    System.out.println("bye");
                    break;
                default:
            }
        }
    }

    public void listCharacter() {
        //list char
    }

    public void chooseCharacter() {
        //choose character
        this.characterMenu();
    }

    public void characterMenu() {
        while (showCharacterMenu == 1) {
            System.out.println("Voulez-vous\n" +
                    "1. Voir les attributs du personnage\n" +
                    "2. Modifier les attributs du personnage\n" +
                    "3. Supprimer le personnage\n" +
                    "4. Retour au menu principal\n"
            );
            String characterMenuChoice = this.sc.nextLine();
            while (!characterMenuChoice.equals("1") && !characterMenuChoice.equals("2") && !characterMenuChoice.equals("3") && !characterMenuChoice.equals("4")) {
                System.out.println("1, 2, 3 ou 4");
                characterMenuChoice = this.sc.nextLine();
            }
            switch (characterMenuChoice) {
                case ("1"):
                    //show attributes
                    break;
                case ("2"):
                    //modify attributes
                    break;
                case ("3"):
                    //delete char
                    break;
                case ("4"):
                    setShowCharacterMenu(0);
                    break;
                default:
            }
        }
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
        System.out.println("Entrez l'URL de l'image de votre Guerrier");
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
        Shield shield = new Shield(shieldName);
        Warrior character = new Warrior(name, image, lifeLevel, attackPower, weapon, shield);

        this.displayWarriorInfo(character);
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
        Potion potion = new Potion(potionName);
        Magician character = new Magician(name, image, lifeLevel, attackPower, spell, potion);

        System.out.println();
    }

    public void storeCharacter() {
        System.out.println("Voulez-vous sauvegarder votre Personnage?\n Entrez y pour sauvergarder");
        String storeCharacter = this.sc.nextLine();
        if (storeCharacter.equals("y") || storeCharacter.equals("Y")) {
            // store here
            System.out.println("Personnage sauvegardé");
        } else {
            System.out.println("Personnage pas sauvegardé");
        }
    }

    public void deleteCharacter() {

    }
}
