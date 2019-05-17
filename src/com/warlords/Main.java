package com.warlords;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Warrior conan = new Warrior("Conan");
        System.out.println(
                "Nom de votre personnage: " + conan.getName() + "\n" +
                        "Image de votre personnage: " + conan.getImage() + "\n" +
                        "Niveau de Vie votre personnage: " + conan.getLifeLevel() + "\n" +
                        "Force d'attaque de votre personnage: " + conan.getAttackPower() + "\n"
        );
//        Magician gandalf = new Magician("Gandalf");
//        System.out.println(gandalf.getName());

        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez le nom de votre personnage:");
        String name = sc.nextLine();
        System.out.println(name);
        Warlord test = new Warlord(name);
        System.out.println(test.getName());

        System.out.println("Voulez-vous créer: \n 1. Un guerrier \n 2. Un magicien \n (entrez 1 ou 2)");
        if (sc.nextInt() == 1) {
            //  Warrior
        } else if (sc.nextInt() == 1) {
            //  Wizard
        } else {
            //  recommencez
        }
    }
}
