package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Player {

    // member variables
    private String name;
    private List<Card> hand;
    private int points;
    private Scanner scanner;

    // constructor
    public Player(String name) {
        this.name = name;
        this.hand = new ArrayList<>();
        this.points = 0;
        this.scanner = new Scanner(System.in);
    }

    // getters
    public String getName() {
        return name;
    }

    public List<Card> getHand() {
        return hand;
    }

    public int getPoints() {
        return points;
    }

    // methods
    public void addPoints() {
        points += 1;
    }

    public void addCardToHand(Card card) {
        hand.add(card);
    }

    public Card playCard() {
        // prompt the user to choose a card to play
        System.out.println(getName() + ", choose a card to play by entering its index:");
        for (int i = 0; i < hand.size(); i++) {
            Card card = hand.get(i);
            System.out.println(i + 1 + ": " + card.getRank() + " of " + card.getColor());
        }
        int choice = scanner.nextInt();
        while (choice < 1 || choice > hand.size()) {
            System.out.println("Invalid choice. Please enter a valid index:");
            choice = scanner.nextInt();
        }
        return hand.remove(choice - 1);
    }

    public void removeCardFromHand(Card card) {
        hand.remove(card);
    }

    public void calculatePoints() {
        // TODO: Implement the logic for calculating the points in the player's hand based on the rules of the game being played
    }

    public void resetHand() {
        hand.clear();
    }

    public void resetPoints() {
        points = 0;
    }

    public void showHands() {
    }

}
