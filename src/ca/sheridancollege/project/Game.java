/**
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 * Add your name as an author and the date!
 */
package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.List;

/**
 * The class that models your game. You should create a more specific child of this class and instantiate the methods
 * given.
 *
 * @author aum
 * @author Paul Bonenfant March 
 */

public class Game {
    private List<Player> players;
    private Deck deck;
    private int rounds;
    private int turnsPerRound;
    private int currentRound;
    private Player currentPlayer;
    private Player otherPlayer;

    public Game() {
        // Constructor code
    }

    public void startNewGame() {
        // Method code
    }

    public void playRound() {
        // Method code
    }

    public Player determineWinner() {
        // Method code
        return null;
        // Method code
    }

    public Player getCurrentPlayer() {
        // Method code
        return null;
        // Method code
    }

    public int getCurrentRound() {
        // Method code
        return 0;
        // Method code
    }

    public int getCurrentTurn() {
        // Method code
        return 0;
        // Method code
    }
}
