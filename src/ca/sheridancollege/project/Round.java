/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca.sheridancollege.project;

/**
 *
 * @author aumth
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Round extends Game {
    private List<Player> players;
    private Deck deck;
    private int turns;
    private int currentTurn;
    private List<Card> turnCards = new ArrayList<>(2);

    public Round(List<Player> players, Deck deck) {
        this.players = players;
        this.deck = deck;
        this.turns = players.size() * 2;
        this.currentTurn = 0;
    }

    @Override
    public void addPlayers() {
        Scanner scanner = new Scanner(System.in);

        int numPlayers = 2;

        for (int i = 1; i <= numPlayers; i++) {
            System.out.print("Enter the name of player " + i + ": ");
            String name = scanner.nextLine();
            Player player = new Player(name);
            players.add(player);
        }
    }

    @Override
    public void play() {
        while (currentTurn < turns) {
            System.out.println("Turn Number: " + (currentTurn + 1));
            System.out.println("+-------------------------+");

            playTurn();

            currentTurn++;
        }
    }

    @Override
    public void declareWinner() {
        System.out.println("+-------------------------+");
        System.out.println("Final Scores:");
        for (Player player : players) {
            System.out.println(player.getName() + ": " + player.getPoints() + " points");
        }
        System.out.println("+-------------------------+");
    }

    @Override
    public void showHands(Player player) {
        System.out.println(player.getName() + "'s hand:");
        List<Card> hand = player.getHand();
        for (int i = 0; i < hand.size(); i++) {
            System.out.println((i + 1) + ". " + hand.get(i).getColor() + " " + hand.get(i).getRank());
        }
        System.out.println("+-------------------------+");
    }

    private void playTurn() {
        for (Player player : players) {
            System.out.println(player.getName() + "'s turn:");
            showHands(player);
            Card card = player.playCard();
            System.out.println("+-------------------------+");
            System.out.println(player.getName() + " plays " + card.getColor() + " " + card.getRank());
            System.out.println("+-------------------------+");
            turnCards.add(card);
            if (turnCards.size() == 2) {
                evaluateTurn(players, turnCards);
            }
        }
    }

    @Override
    public void playRound() {
        System.out.println("+-------------------------+");
        System.out.println("Round Start ->");
    
        Round round = new Round(players, deck);
    
        while (getCurrentRound() <= getRounds()) {
            round.play();
    
            // Increment round number
            setCurrentRound(getCurrentRound() + 1);
            startGame();
        }
    
        // Game is over, determine winner
        Player winner = null;
        int highestScore = Integer.MIN_VALUE;
    
        if (players.get(0).getPoints() == players.get(1).getPoints()){
            System.out.println("Game Over! Its a Tie Between Both Players at score " + players.get(0).getPoints());
        }
        else{
            for (Player player : players) {
                if (player.getPoints() > highestScore) {
                    winner = player;
                    highestScore = player.getPoints();
                }
            }
            System.out.println("Game over! " + winner.getName() + " wins with " + highestScore + " points.");
        }
    }    

    @Override
    public void evaluateTurn(List<Player> players, List<Card> turnCards) {
        Card c1 = turnCards.get(0);
        Card c2 = turnCards.get(1);

        if (c1.getColor() == c2.getColor()) {
            if (c1.getPointValue() > c2.getPointValue()) {
                players.get(0).addPoints();
            } else {
                players.get(1).addPoints();
            }
        } else {
            if (c1.getColor() == "Black") {
                players.get(0).addPoints();
            } else if (c2.getColor() == "Black") {
                players.get(1).addPoints();
            }
        }

        for (Player player : players) {
            System.out.println(player.getName() + " scores " + player.getPoints() + " points");
        }

        turnCards.clear();
    }
    
    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public Deck getDeck() {
        return deck;
    }

    public void setDeck(Deck deck) {
        this.deck = deck;
    }

    public int getTurns() {
        return turns;
    }

    public void setTurns(int turns) {
        this.turns = turns;
    }

    public int getCurrentTurn() {
        return currentTurn;
    }

    public void setCurrentTurn(int currentTurn) {
        this.currentTurn = currentTurn;
    }

    public List<Card> getTurnCards() {
        return turnCards;
    }

    public void setTurnCards(List<Card> turnCards) {
        this.turnCards = turnCards;
    }
}