package com.warlords;

public class NonIntegerException extends Exception {

    @Override
    public String getMessage() {
        return "Veuillez entrer un nombre entier !";
    }
}
