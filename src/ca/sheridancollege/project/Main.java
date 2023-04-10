/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author aumth
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Generate Deck and Shuffle
        Deck deck = new Deck();
        deck.shuffle();

        // Create Round and start game
        Round round = new Round(new ArrayList<Player>(), deck);
        round.setRounds();
        round.addPlayers();
        round.startGame();
        round.showHands(round.getPlayers().get(0));
        round.playRound();
    }
}
