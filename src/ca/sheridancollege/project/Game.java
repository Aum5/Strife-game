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

public class Game {
    private List<Player> players;
    private Deck deck;
    private int rounds;
    private int turns = 5;
    private int currentTurn = 1;
    private int currentRound = 1;
    private Player attribute;
    private Player otherPlayer;
    private Player currentPlayer;
    private List<Card> turnCards = new ArrayList<>(2);

    public Game() {
        this.players = new ArrayList<>();
        this.deck = new Deck();
    }

        public void setRounds() {
            Scanner scanner = new Scanner(System.in);
            int numRounds;
            boolean validRoundNumber;
                
            do {
            System.out.println("*Rounds must be between 1 and 10.");
            System.out.print("Enter the total number of rounds: ");
                numRounds = scanner.nextInt();
                validRoundNumber = checkRoundNumber(numRounds);
                if (!validRoundNumber) {
                    System.out.println("Invalid number of rounds. Please enter a number between 1 and 10.");
                }
            } while (!validRoundNumber);
                
            this.rounds = numRounds;
        }
            
        public boolean checkRoundNumber(int numRounds) {
            return numRounds >= 1 && numRounds <= 10;
        }
    
        
    public void addPlayers() {
        Scanner scanner = new Scanner(System.in);

        int numPlayers = 2;

        for (int i = 1; i <= numPlayers; i++) {
            String name;
            boolean isUnique = false;
            
            while (!isUnique) {
                System.out.println("*Player Name must be different");
                System.out.print("Enter the name of player " + i + ": ");
                name = scanner.nextLine();
            
                if (isNameUnique(name)) {
                    Player player = new Round(name);
                    players.add(player);
                    isUnique = true;
                } else {
                    System.out.println("That name is already taken. Please enter a different name.");
                }
            }
        }
    }

    private boolean isNameUnique(String name) {
    for (Player player : players) {
        if (player.getName().equals(name)) {
            return false;
        }
    }
    return true;
    }


    public void startGame() {
        Deck deck = new Deck();
        deck.shuffle();

        for (int i = 0; i < 5; i++) {
            for (Player player : players) {
                Card card = deck.drawCard();
                player.addCardToHand(card);
            }
        }
    }

    public void playRound() {
        while (currentRound <= rounds) {

            System.out.println("Round " + currentRound + " Start ->");

            while (currentTurn <= turns) {


                // Each player takes a turn
                for (Player player : players) {
                    System.out.println(player.getName() + "'s turn:");

                    //Show player Hand
                    showHands(player);


                    Card card = player.playCard();
                    System.out.println(player.getName() + " plays " + card.getColor() + " " + card.getRank());


                    System.out.println(players.indexOf(player));
                    turnCards.add(players.indexOf(player), card);


                    if (players.indexOf(player) == 1) {

                        evaluateTurn();
                    }

                }
                for (Player player : players) {
                    System.out.println(player.getName() + " scores " + player.getPoints() + " points");
                }
                currentTurn++;
            }

                // Increment round number
            currentRound++;
            currentTurn = 1;
            System.out.println("Round OVER...");
            System.out.println("Shuffling Deck...");
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

    public void evaluateTurn(){

        Card c1 = turnCards.get(0);
        Card c2 = turnCards.get(1);

        if(c1.getColor() == c2.getColor()){
            if(c1.getPointValue() > c2.getPointValue() ){
                players.get(0).addPoints();
            }else{
                players.get(1).addPoints();
            }
        }
        else{
            if(c1.getColor() == "Black"){
                players.get(0).addPoints();
            }
            else if (c2.getColor() == "Black"){
                players.get(1).addPoints();
            }
        }

    }

   
	public Player getCurrentPlayer() {
		return this.currentPlayer;
	}

	public void showHands(){
        for (Player player : players) {
            System.out.println(player.getName() + "'s hand:");
            int i = 1;
            for (Card card : player.getHand()) {
                System.out.println( i + ". " + card.getColor() + " " + card.getRank());
                i++;
            }

            System.out.println();
        }
    }

    public void showHands(Player player){
        System.out.println(player.getName() + "'s hand:");
        int i = 1;
        for (Card card : player.getHand()) {
            System.out.println( i + ". " + card.getColor() + " " + card.getRank());
            i++;
        }

        System.out.println();
    }
}