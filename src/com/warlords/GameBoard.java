package com.warlords;

import java.util.ArrayList;
import java.util.Scanner;

public class GameBoard {

    //  attribute
    private ArrayList<String> gameBoard;

    enum GameBoardBox {
        MONSTER,
        PLAIN,
        BONUS,
    }

    private Scanner sc = new Scanner(System.in);


    //  mutator
    public ArrayList<String> getGameBoard() {
        return gameBoard;
    }

    public void setGameBoard(ArrayList<String> gameboard) {
        this.gameBoard = gameboard;
    }

    //  constructor
    public GameBoard(ArrayList<String> gameBoard) {
        this.gameBoard = gameBoard;
    }

    //  methods
    public enum randomMonster(){

    }

    public void gameBoardCreationDialog() {
        System.out.println("Entrez la taille de votre plateau de jeu");
        int gameBoardDimension = sc.nextInt();

        for (int i =  0; i < gameBoardDimension; i++){
            gameBoard.set(i,);
        }
    }
}
