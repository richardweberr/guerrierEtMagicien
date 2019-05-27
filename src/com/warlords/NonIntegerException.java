package com.warlords;

public class NonIntegerException extends Exception {

    @Override
    public String getMessage() {
        return "VEUILLEZ ENTRER UN NOMBRE ENTIER !";
    }
}
