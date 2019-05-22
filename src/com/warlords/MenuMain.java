package com.warlords;

import java.util.Scanner;


public class MenuMain {

    //  attributes
    private Scanner sc = new Scanner(System.in);
    private int showMainMenu = 1;
    private int showCharacterMenu = 1;
    private int characterCounter;
    private Warlord[] characterList = new Warlord[6];


    //mutator
    private int getShowMainMenu() {
        return showMainMenu;
    }

    private void setShowMainMenu(int showMenu) {
        this.showMainMenu = showMenu;
    }

    private int getShowCharacterMenu() {
        return showCharacterMenu;
    }

    private void setShowCharacterMenu(int showCharacterMenu) {
        this.showCharacterMenu = showCharacterMenu;
    }


    //methods
    public void mainMenu() {
        characterCounter = 1;
        while (showMainMenu == 1) {
            System.out.println("\n" +
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
                    this.chooseCharacterMenu();
                    this.characterMenu(chooseCharacter());
                    break;
                case ("3"):
                    this.createWarlord();
                    characterCounter++;
                    break;
                case ("4"):
                    this.chooseCharacterMenu();
                    this.deleteCharacter(chooseCharacter());
                    break;
                case ("5"):
                    setShowMainMenu(0);
                    System.out.println("bye");
                    break;
                default:
            }
        }
    }

    private void listCharacter() {
        for (int i = 1; i < characterList.length; i++) {
            if (characterList[i] != null) {
                System.out.println("Personnage: " + i + "\n" + characterList[i]);
            }
        }
    }

    private void chooseCharacterMenu() {
        for (int i = 1; i < characterList.length; i++) {
            if (characterList[i] != null) {
                System.out.println("Personnage: " + i + " -- " + "Nom: " + characterList[i].getName() + "\n");
            }
        }
    }

    private int chooseCharacter() {
        System.out.println("Entrez le numero du personnage que vous voulez selectionner");
        int characterIndexNum = this.sc.nextInt();
        this.sc.nextLine();

        return (characterIndexNum);
    }

    private void characterMenu(int characterIndex) {
        Warlord character = this.characterList[characterIndex];
        while (this.showCharacterMenu == 1) {
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
                    System.out.println(character);
                    break;
                case ("2"):
                    //modify attributes
                    break;
                case ("3"):
                    this.deleteCharacter(characterIndex);
                    System.out.println("Personnage effacé");
                    this.setShowCharacterMenu(0);
                    break;
                case ("4"):
                    this.setShowCharacterMenu(0);
                    break;
                default:
            }
        }
    }

    private void createWarlord() {
        System.out.println("Voulez-vous créer:\n 1. Un guerrier\n 2. Un magicien\n");
        String classChoice = this.sc.nextLine();
        while (!classChoice.equals("1") && !classChoice.equals("2")) {
            System.out.println("1 ou 2");
            classChoice = this.sc.nextLine();
        }
        switch (classChoice) {
            case ("1"):
                this.createWarrior();
                break;
            case ("2"):
                this.createMagician();
                break;
            default:
        }
    }

    private void createWarrior() {
        Warlord character;

        System.out.println("Entrez le nom de votre Guerrier");
        String name = this.sc.nextLine();
//        System.out.println("Entrez l'URL de l'image de votre Guerrier");
//        String image = this.sc.nextLine();
        String image = "imgURL";
//        System.out.println("Entrez le niveau de vie de votre Guerrier");
//        int lifeLevel = this.sc.nextInt();
//        this.sc.nextLine();
        int lifeLevel = generateRandom(5, 10);
//        System.out.println("Entrez la force d'attaque de votre Guerrier");
//        int attackPower = this.sc.nextInt();
//        this.sc.nextLine();
        int attackPower = generateRandom(5, 10);
        System.out.println("Entrez le nom de votre arme");
        String weaponName = this.sc.nextLine();
//        System.out.println("Entrez le niveau de votre arme");
//        int weaponLevel = this.sc.nextInt();
//        this.sc.nextLine();
        int weaponLevel = generateRandom(1, 10);
        System.out.println("Entrez le nom de votre bouclier");
        String shieldName = this.sc.nextLine();

        Weapon weapon = new Weapon(weaponName, weaponLevel);
        Shield shield = new Shield(shieldName);
        character = new Warrior(name, image, lifeLevel, attackPower, weapon, shield);

        this.storeCharacter(character);
    }

    private void createMagician() {
        Warlord character;

        System.out.println("Entrez le nom de votre Magicien");
        String name = this.sc.nextLine();
//        System.out.println("Entrez l'URL de l'image de votre Magicien");
//        String image = this.sc.nextLine();
        String image = "imgURL";
//        System.out.println("Entrez le niveau de vie de votre Magicien");
//        int lifeLevel = this.sc.nextInt();
//        this.sc.nextLine();
        int lifeLevel = generateRandom(3, 6);
//        System.out.println("Entrez la force d'attaque de votre Magicien");
//        int attackPower = this.sc.nextInt();
//        this.sc.nextLine();
        int attackPower = generateRandom(8, 15);
        System.out.println("Entrez le nom de votre sort");
        String spellName = this.sc.nextLine();
//        System.out.println("Entrez le niveau de votre sort");
//        int spellLevel = this.sc.nextInt();
//        this.sc.nextLine();
        int spellLevel = generateRandom(1, 10);
        System.out.println("Entrez le nom de votre philtre");
        String potionName = this.sc.nextLine();

        Spell spell = new Spell(spellName, spellLevel);
        Potion potion = new Potion(potionName);
        character = new Magician(name, image, lifeLevel, attackPower, spell, potion);

        this.storeCharacter(character);
    }

    private void storeCharacter(Warlord character) {
        System.out.println("Voulez-vous sauvegarder votre Personnage?\n(Entrez y pour sauvergarder)");
        String storeCharacter = this.sc.nextLine();
        if (storeCharacter.equals("y") || storeCharacter.equals("Y")) {
            this.characterList[characterCounter] = character;
            System.out.println("Personnage sauvegardé");
        } else {
            System.out.println("Personnage pas sauvegardé");
        }
    }

    private void deleteCharacter(int i) {
        this.characterList[i] = null;
    }

    private int generateRandom(int min, int max) {
        return min + (int) (Math.random() * (max - min + 1));
    }

}
