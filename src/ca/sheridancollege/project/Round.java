/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca.sheridancollege.project;

/**
 *
 * @author aumth
 */
import java.util.List;

public class Round {
    private List<Player> players;
    private Deck deck;
    private int turns;
    private int currentTurn;

    public Round(List<Player> players, Deck deck) {
        this.players = players;
        this.deck = deck;
        this.turns = players.size() * 2;
        this.currentTurn = 0;
    }

    public void playTurn() {
        // TODO: Implement the logic for playing a turn
    }

    public Player determineTurnWinner() {
        // TODO: Implement the logic for determining the winner of a turn
        return null;
    }

    public void nextTurn() {
        currentTurn++;
    }

    public boolean isRoundOver() {
        return currentTurn >= turns;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public Deck getDeck() {
        return deck;
    }

    public int getCurrentTurn() {
        return currentTurn;
    }
}