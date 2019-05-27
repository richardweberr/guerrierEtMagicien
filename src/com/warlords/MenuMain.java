package com.warlords;


import java.util.Scanner;
import java.util.ArrayList;


public class MenuMain {

    //  attributes
    /**
     * instantiate a scanner for console input
     */
    private Scanner sc = new Scanner(System.in);

    /**
     * an ArrayList to staore generated characters
     */
    private ArrayList<Warlord> characterList = new ArrayList<Warlord>();

    /**
     * counter for the number of characters created
     */
    private int characterCounter = 1;


    //  mutator
    public void setCharacterCounter(int characterCounter) {
        this.characterCounter = characterCounter;
    }

    public ArrayList<Warlord> getCharacterList() {
        return characterList;
    }


    //  methods

    /**
     * display in console the main MENU
     */
    public void mainMenu() {
        this.setCharacterCounter(1);
        this.getCharacterList().add(0, null);
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
            while (!menuChoice.equals("1") && !menuChoice.equals("2") && !menuChoice.equals("3") && !menuChoice.equals("4") && !menuChoice.equals("5") && !menuChoice.equals("11")) {
                System.out.println("1, 2, 3, 4 ou 5");
                menuChoice = this.sc.nextLine();
            }
            switch (menuChoice) {
                case ("1"):
                    this.listCharacter();
                    break;
                case ("2"):
                    this.listCharacter();
                    this.characterMenu(chooseCharacter());
                    break;
                case ("3"):
                    this.createWarlord();
                    characterCounter++;
                    break;
                case ("4"):
                    this.listCharacter();
                    this.deleteCharacter(chooseCharacter());
                    break;
                case ("5"):
                    showMainMenu = false;
                    this.sc.close();
                    System.out.println("bye");
                    break;
                case ("11"):
                    Weapon weapon = new Weapon("totoWeapon", 10);
                    Shield shield = new Shield("totoShield");
                    Warlord toto = new Warrior("toto", "totourl", 5, 5, weapon, shield);
                    this.getCharacterList().add(toto);
                    Spell spell = new Spell("titiSpeell", 10);
                    Potion potion = new Potion("titiPotion");
                    Warlord titi = new Magician("titi", "titiurl", 5, 5, spell, potion);
                    this.getCharacterList().add(titi);
                    break;
            }
        }
    }

    /**
     * display in console the MENU for characters options
     * @param characterIndex
     */
    private void characterMenu(int characterIndex) {
        if (characterIndex != 0) {
            Warlord character = this.characterList.get(characterIndex);
            System.out.println("Vous avez choisi: " + character.getName());
            boolean characterMenu = true;
            while (characterMenu) {
                System.out.println("Voulez-vous:\n" +
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
    }

    /**
     * display in console the MENU to modify character attributes
     * @param characterIndex
     */
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
                System.out.println("1, 2, 3, 4, 5, 6, 7 ou 8");
                attributeChoice = this.sc.nextLine();
            }
            switch (attributeChoice) {
                case ("1"):
                    characterList.get(characterIndex).setName(attributeDialogName());
                    System.out.println("Le nom de votre Personnage est maintenant " + characterList.get(characterIndex).getName());
                    break;
                case ("2"):
                    characterList.get(characterIndex).setImage(attributeDialogImage());
                    System.out.println("l'URL de l'image de votre Personnage est maintenant " + characterList.get(characterIndex).getImage());
                    break;
                case ("3"):
                    characterList.get(characterIndex).setLifeLevel(attributeDialogLifeLevel());
                    System.out.println("Le niveau de vie de votre Personnage est maintenant " + characterList.get(characterIndex).getLifeLevel());
                    break;
                case ("4"):
                    characterList.get(characterIndex).setAttackPower(attributeDialogAttackPower());
                    System.out.println("La force d'attaque de votre Personnage est maintenant " + characterList.get(characterIndex).getAttackPower());
                    break;
                case ("5"):
                    characterList.get(characterIndex).getAttack().setName(attributeDialogAttackName());
                    System.out.println("La nom de l'arme de votre Personnage est maintenant " + characterList.get(characterIndex).getAttack().getName());
                    break;
                case ("6"):
                    characterList.get(characterIndex).getAttack().setLevel(attributeDialogAttackLevel());
                    System.out.println("Le niveau de l'arme de votre Personnage est maintenant " + characterList.get(characterIndex).getAttack().getLevel());
                    break;
                case ("7"):
                    characterList.get(characterIndex).getDefense().setName(attributeDialogDefenseName());
                    System.out.println("Le nom du bouclier de votre personnage est maintenant " + characterList.get(characterIndex).getDefense().getName());
                    break;
                case ("8"):
                    attributeMenu = false;
                    break;
            }
        }
    }

    /**
     * display in console a MENU to ask for a class choice
     * @return the input string
     */
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

    /**
     *  display in console the index and name of a chararcter
     */
    private void listCharacter() {
        if (this.getCharacterList().size() > 1) {
            for (int i = 1; i < this.getCharacterList().size(); i++) {
                if (this.getCharacterList().get(i) != null) {
                    System.out.println("Personnage: " + i + " -- " + this.getCharacterList().get(i).getName());
                }
            }
        } else {
            System.out.println("Pas de personnage");
        }
    }

    /**
     * display in console a dialog to select a character
     * @return index of chararcter in characterList
     */
    private int chooseCharacter() {
        int characterIndex = 0;
        if (this.getCharacterList().size() > 1) {
            System.out.println("Entrez le numero du personnage que vous voulez selectionner");
            String characterIndexToTest = this.sc.nextLine();
            int characterIndexNum = testInteger(characterIndexToTest);
            for (int i = 1; i < this.getCharacterList().size(); i++) {
                if (characterIndexNum == i) {
                    characterIndex = characterIndexNum;
                } else {
                    System.out.println("Entrez un numero de personnage");
                }
            }
        }
        return (characterIndex);
    }

    /**
     * display in console a dialog to ask for a name
     * @return the input string
     */
    private String attributeDialogName() {
        System.out.println("Entrez le nom de votre Personnage");
        return this.sc.nextLine();
    }

    /**
     * display in console a dialog to ask for an image
     * @return the input string
     */
    private String attributeDialogImage() {
        System.out.println("Entrez l'URL de l'image de votre Personnage");
        return this.sc.nextLine();
    }

    /**
     * display in console a dialog to ask for a lifelevel
     * @return the input integer
     */
    private int attributeDialogLifeLevel() {
        int lifeLevel = 0;
        do {
            System.out.println("Entrez le niveau de vie de votre Personnage\n" +
                    "Valeur entre :\n" +
                    "Pour les Guerriers: " + Warrior.getMINLIFELEVEL() + " et " + Warrior.getMAXLIFELEVEL() + "\n" +
                    "Pour les Magiciens: " + Magician.getMINLIFELEVEL() + " et " + Magician.getMAXLIFELEVEL());
            String stringToTest = sc.nextLine();
            lifeLevel = testInteger(stringToTest);
            return lifeLevel;
        } while (lifeLevel == 0);
    }

    /**
     * display in console a dialog to ask for an attackpower
     * @return the input integer
     */
    private int attributeDialogAttackPower() {
        int attackPower = 0;
        do {
            System.out.println("Entrez la force d'attaque de votre Personnage\n" +
                    "Valeur entre :\n" +
                    "Pour les Guerriers: " + Warrior.getMINATTACKPOWER() + " et " + Warrior.getMAXATTACKPOWER() + "\n" +
                    "Pour les Magiciens: " + Magician.getMINATTACKPOWER() + " et " + Magician.getMAXATTACKPOWER());
            String stringToTest = sc.nextLine();
            attackPower = testInteger(stringToTest);
            return attackPower;
        } while (attackPower == 0);
    }

    /**
     * display in console a dialog to ask for a weapon or spell name
     * @return the input string
     */
    private String attributeDialogAttackName() {
        System.out.println("Entrez le nom de votre arme/sort ");
        return this.sc.nextLine();
    }

    /**
     * display in console a dialog to ask for a weapon or spell level
     * @return the input integer
     */
    private int attributeDialogAttackLevel() {
        int attackLevel = 0;
        do {
            System.out.println("Entrez le niveau de votre arme/sort\n" +
                    "Valeur entre :\n" +
                    "Pour les Armes: " + Weapon.getMINLEVEL() + " et " + Weapon.getMAXLEVEL() + "\n" +
                    "Pour les Sorts: " + Spell.getMINLEVEL() + " et " + Spell.getMAXLEVEL());
            String stringToTest = sc.nextLine();
            attackLevel = testInteger(stringToTest);
            return attackLevel;
        } while (attackLevel == 0);
    }

    /**
     * display in console a dialog to ask for a shield or potion name
     * @return the input string
     */
    private String attributeDialogDefenseName() {
        System.out.println("Entrez le nom de votre bouclier/philtre");
        return this.sc.nextLine();
    }

    /**
     * display in console warrior creation dialog
     * instantiate warrior
     */
    private void createWarrior() {
        Warlord character;

        System.out.println("Entrez le nom de votre Guerrier");
        String name = this.sc.nextLine();
        String image = "imgURL";
        int lifeLevel = generateRandom(Warrior.getMINLIFELEVEL(), Warrior.getMAXLIFELEVEL());
        int attackPower = generateRandom(Warrior.getMINATTACKPOWER(), Warrior.getMAXATTACKPOWER());
        System.out.println("Entrez le nom de votre arme");
        String weaponName = this.sc.nextLine();
        int weaponLevel = generateRandom(Weapon.getMINLEVEL(), Weapon.getMAXLEVEL());
        System.out.println("Entrez le nom de votre bouclier");
        String shieldName = this.sc.nextLine();

        Weapon weapon = new Weapon(weaponName, weaponLevel);
        Shield shield = new Shield(shieldName);
        character = new Warrior(name, image, lifeLevel, attackPower, weapon, shield);

        this.storeCharacter(character);
    }

    /**
     * display in console magician creation dialog
     * instantiate magician
     */
    private void createMagician() {
        Warlord character;

        System.out.println("Entrez le nom de votre Magicien");
        String name = this.sc.nextLine();
        String image = "imgURL";
        int lifeLevel = generateRandom(Magician.getMINLIFELEVEL(), Magician.getMAXLIFELEVEL());
        int attackPower = generateRandom(Magician.getMINATTACKPOWER(), Magician.getMAXATTACKPOWER());
        System.out.println("Entrez le nom de votre sort");
        String spellName = this.sc.nextLine();
        int spellLevel = generateRandom(Spell.getMINLEVEL(), Spell.getMAXLEVEL());
        System.out.println("Entrez le nom de votre philtre");
        String potionName = this.sc.nextLine();

        Spell spell = new Spell(spellName, spellLevel);
        Potion potion = new Potion(potionName);
        character = new Magician(name, image, lifeLevel, attackPower, spell, potion);

        this.storeCharacter(character);
    }

    /**
     * store chararcter in chararcterList
     * @param character
     */
    private void storeCharacter(Warlord character) {
        System.out.println("Voulez-vous sauvegarder votre Personnage?\n(Entrez y pour sauvergarder)");
        String storeCharacter = this.sc.nextLine();
        if (storeCharacter.equals("y") || storeCharacter.equals("Y")) {
            this.getCharacterList().add(character);
            System.out.println("Personnage sauvegardé");
        } else {
            characterCounter--;
            System.out.println("Personnage pas sauvegardé");
        }
    }

    /**
     * delete selected character
     * @param i chararcterindex
     */
    private void deleteCharacter(int i) {
        this.getCharacterList().remove(i);
    }

    //    private int testInteger(String stringToTest) {
//        int testedString = 0;
//        try {
//            testedString = Integer.parseInt(stringToTest);
//        } catch (NumberFormatException error) {
//            System.out.println("Veulliez entrer un nombre entier " + error.getMessage());
//        } finally {
//            System.out.println("entry tested for integer value");
//        }
//        return testedString;
//    }

    /**
     * converts a string to integer if possible
     * @exception if it fails
     * @param stringToTest
     * @return testedInteger
     */
    private int testInteger(String stringToTest) {
        int testedString = 0;
        try {
            testedString = Integer.parseInt(stringToTest);
        } catch (NumberFormatException error) {
            System.out.println("Veulliez entrer un nombre entier " + error.getMessage());
        } finally {
            System.out.println("entry tested for integer value");
        }
        return testedString;
    }

    /**
     * generate a random integer in the min, max interval
     * @param min
     * @param max
     * @return the random int
     */
    private int generateRandom(int min, int max) {
        return min + (int) (Math.random() * (max - min + 1));
    }
}
