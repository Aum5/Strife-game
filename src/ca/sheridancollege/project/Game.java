/**
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 * Add your name as an author and the date!
 */
package ca.sheridancollege.project;

import java.util.List;

/**
 * The class that models your game. You should create a more specific child of this class and instantiate the methods
 * given.
 *
 * @author aum
 * @author Paul Bonenfant March 
 */

public abstract class Game {
    protected int rounds;
    private int currentRound;

    public Game() {
        this.rounds = 3;
        this.currentRound = 1;
    }

    public abstract void setRounds();
    public abstract void addPlayers();
    public abstract void play();
    public abstract void declareWinner();
    public abstract void showHands(Player player);
    public abstract void playRound();
    public abstract void evaluateTurn(List<Player> players, List<Card> turnCards);
    public abstract void startGame();
    
    public int getRounds() {
        return this.rounds;
    }

    public int getCurrentRound() {
        return this.currentRound;
    }

    public void setCurrentRound(int currentRound) {
        this.currentRound = currentRound;
    }
}
