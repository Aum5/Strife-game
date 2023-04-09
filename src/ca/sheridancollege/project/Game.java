/**
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 * Add your name as an author and the date!
 */
package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * The class that models your game. You should create a more specific child of this class and instantiate the methods
 * given.
 *
 * @author aum
 * @author Paul Bonenfant March 
 */

public abstract class Game {

    private List<Player> players;
    private Deck deck;
    private int rounds;
    private List<Round> roundList;
    private int currentRound = 0;

    public Game() {
        this.players = new ArrayList<>();
        this.deck = new Deck();
        this.roundList = new ArrayList<>();
    }

    public void setRounds() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the total number of rounds: ");
        int numRounds = scanner.nextInt();
        scanner.nextLine(); // consume the newline character

        this.rounds = numRounds;
    }

    public void startGame() {
        deck.shuffle();

        for (int i = 0; i < 5; i++) {
            for (Player player : players) {
                Card card = deck.drawCard();
                player.addCardToHand(card);
            }
        }
    }

    public abstract void addPlayers();

    public abstract void showHands(Player player);

    public abstract void play();

    public abstract void declareWinner();

    public abstract void playRound();

    protected abstract void evaluateTurn(List<Player> players, List<Card> turnCards);

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

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public List<Round> getRoundList() {
        return roundList;
    }

    public void setRoundList(List<Round> roundList) {
        this.roundList = roundList;
    }

    public int getCurrentRound() {
        return currentRound;
    }

    public void setCurrentRound(int currentRound) {
        this.currentRound = currentRound;
    }
}
