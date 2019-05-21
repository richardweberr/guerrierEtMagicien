package com.warlords;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        

        System.out.println("Entrez le nom de votre personnage:");
        String name = sc.nextLine();

        System.out.println("Voulez-vous créer: \n 1. Un guerrier \n 2. Un magicien \n (entrez 1 ou 2)");
        String classInfo = sc.nextLine();

        while (!(classInfo.equals("1")) && !(classInfo.equals("2"))) {
            System.out.println("1 ou 2");
            classInfo = sc.nextLine();
        }

        if (classInfo.equals("1")) {
            Warrior monPerso = new Warrior(name);

            System.out.println("Entrez le nom de votre arme");
            String weaponName = sc.nextLine();
            System .out.println("Entrez le niveau de votre arme");
            int weaponLevel = sc.nextInt();sc.nextLine();
            monPerso.setWeapon(weaponName, weaponLevel);

            System.out.println(monPerso.printClassInfo());
            System.out.println(monPerso.printNameInfo());
            System.out.println(monPerso.printAttibuteInfo());
            System.out.println(monPerso.printWeaponInfo());
        } else {
            Magician monPerso = new Magician(name);

            System.out.println("Entrez le nom de votre sort");
            String spellName = sc.nextLine();
            System .out.println("Entrez le niveau de votre sort");
            int spellLevel = sc.nextInt();sc.nextLine();
            monPerso.setSpell(spellName, spellLevel);

            System.out.println(monPerso.printClassInfo());
            System.out.println(monPerso.printNameInfo());
            System.out.println(monPerso.printAttibuteInfo());
            System.out.println(monPerso.printSpellInfo());
        }
    }
}
