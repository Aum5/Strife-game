package ca.sheridancollege.project;

import java.util.List;

public abstract class Player {
    private String name;
    protected List<Card> hand;
    private int points;

    public Player(String name) {
        this.name = name;
        this.hand = initializeHand();
        this.points = 0;
    }

    public String getName() {
        return name;
    }

    public List<Card> getHand() {
        return hand;
    }

    public int getPoints() {
        return points;
    }

    public void addPoints(){ 
        points+=1; 
    }

    public abstract List<Card> initializeHand();

    public abstract Card playCard();

    public void addCardToHand(Card card) {
        hand.add(card);
    }

    public void removeCardFromHand(Card card){
        hand.remove(card);
    }

    public void resetHand() {
        hand.clear();
    }

    public void resetPoints() {
        points = 0;
    }
}