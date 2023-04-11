package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Round extends Player {
    private Scanner scanner;

    public Round(String name) {
        super(name);
        scanner = new Scanner(System.in);
    }

    @Override
    public List<Card> initializeHand() {
        return new ArrayList<>();
    }

    @Override
    public Card playCard(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose a card to play by entering its index:");
    
        int choice = scanner.nextInt();
        while (!isValidChoice(choice, hand.size())) {
            System.out.println("Invalid choice. Please enter a valid index:");
            choice = scanner.nextInt();
        }
        return hand.remove(choice - 1);
    }    

    public boolean isValidChoice(int choice, int handSize) {
        return choice >= 1 && choice <= handSize;
    } 
}