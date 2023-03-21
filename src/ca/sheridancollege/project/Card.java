package ca.sheridancollege.project;


/**
 * A class to represent a single playing card.
 */

public abstract class Card {
    private String color;
    private String rank;

    public Card(String color, String rank) {
        this.color = color;
        this.rank = rank;
    }

    public String getColor() {
        return color;
    }

    public String getRank() {
        return rank;
    }

    public int getPointValue() {
        // TODO: Implement the logic for determining the point value of a card based on its rank
        return 0;
    }
}