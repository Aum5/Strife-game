/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca.sheridancollege.project;

import java.util.Scanner;

/**
 *
 * @author aumth
 */
public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        //Generate Deck and Shuffle

        Game game = new Game();
        game.setRounds();
        game.addPlayers();
        game.startGame();
        game.showHands();
        game.playRound();

    }
}
