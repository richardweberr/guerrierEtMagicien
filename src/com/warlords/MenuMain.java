package com.warlords;

import java.util.Scanner;


public class MenuMain {

    //  attributes
    private Scanner sc = new Scanner(System.in);
    private int characterCounter = 1;
    private Warlord[] characterList = new Warlord[6];


    //  mutator


    //  methods
    public void mainMenu() {
        characterCounter = 1;
        boolean showMainMenu = true;
        while (showMainMenu) {
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
                    showMainMenu = false;
                    sc.close();
                    System.out.println("bye");
                    break;
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

    private void characterMenu(int characterIndex) {
        Warlord character = this.characterList[characterIndex];
        boolean characterMenu = true;
        while (characterMenu) {
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
                    characterAttributesMenu(characterIndex);
                    break;
                case ("3"):
                    this.deleteCharacter(characterIndex);
                    System.out.println("Personnage effacé");
                    characterMenu = false;
                    break;
                case ("4"):
                    characterMenu = false;
                    break;
            }
        }
    }

    private void characterAttributesMenu(int characterIndex) {
        boolean attributeMenu = true;
        while (attributeMenu) {
            System.out.println("Selectionner le numéro de l'attribut que vous voulez modifier dans la liste\n" +
                    "1. Le nom\n" +
                    "2. L'adresse de l'image\n" +
                    "3. Le niveau de vie\n" +
                    "4. La force d'attaque\n" +
                    "5. Le nom de votre arme ou sort\n" +
                    "6. La force de votre arme ou sort\n" +
                    "7. Le nom de votre bouclier ou philtre\n" +
                    "8. Retour au menu précédent");
            String attributeChoice = this.sc.nextLine();
            while (!attributeChoice.equals("1") && !attributeChoice.equals("2") && !attributeChoice.equals("3") && !attributeChoice.equals("4")
                    && !attributeChoice.equals("5") && !attributeChoice.equals("6") && !attributeChoice.equals("7") && !attributeChoice.equals("8")) {
                System.out.println("1, 2, 3, 4 ou 5");
                attributeChoice = this.sc.nextLine();
            }
            switch (attributeChoice) {
                case ("1"):
                    System.out.println("Entrez le nom de votre Personnage");
                    String name = this.sc.nextLine();
                    characterList[characterIndex].setName(name);
                    break;
                case ("2"):
                    System.out.println("Entrez l'URL de l'image de votre Personnage");
                    String image = this.sc.nextLine();
                    characterList[characterIndex].setImage(image);
                    break;
                case ("3"):
                    System.out.println("Entrez le niveau de vie de votre Personnage");
                    int lifeLevel = this.sc.nextInt();
                    this.sc.nextLine();
                    characterList[characterIndex].setLifeLevel(lifeLevel);
                    break;
                case ("4"):
                    System.out.println("Entrez la force d'attaque de votre Personnage");
                    int attackPower = this.sc.nextInt();
                    this.sc.nextLine();
                    characterList[characterIndex].setAttackPower(attackPower);
                    break;
                case ("5"):
                    System.out.println("Entrez le nom de l'arme ou du sort de votre Personnage");
                    String attackItemName = this.sc.nextLine();
                    characterList[characterIndex].getAttack().setName(attackItemName);
                    break;
                case ("6"):
                    System.out.println("Entrez le niveau de l'arme ou du sort de votre Personnage");
                    int attackItemLevel = this.sc.nextInt();
                    this.sc.nextLine();
                    characterList[characterIndex].getAttack().setLevel(attackItemLevel);
                    break;
                case ("7"):
                    System.out.println("Entrez le nom du bouclier ou sort de votre Personnage");
                    String defenseItemName = this.sc.nextLine();
                    characterList[characterIndex].getDefense().setName(defenseItemName);
                    break;
                case ("8"):
                    attributeMenu = false;
                    break;
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

    private int chooseCharacter() {
        System.out.println("Entrez le numero du personnage que vous voulez selectionner");
        int characterIndexNum = this.sc.nextInt();
        this.sc.nextLine();

        return (characterIndexNum);
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
        }
    }

    private void createWarrior() {
        Warlord character;

        System.out.println("Entrez le nom de votre Guerrier");
        String name = this.sc.nextLine();
        String image = "imgURL";
        int lifeLevel = generateRandom(5, 10);
        int attackPower = generateRandom(5, 10);
        System.out.println("Entrez le nom de votre arme");
        String weaponName = this.sc.nextLine();
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
        String image = "imgURL";
        int lifeLevel = generateRandom(3, 6);
        int attackPower = generateRandom(8, 15);
        System.out.println("Entrez le nom de votre sort");
        String spellName = this.sc.nextLine();
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
