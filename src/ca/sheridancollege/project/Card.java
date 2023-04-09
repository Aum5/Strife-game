package ca.sheridancollege.project;


/**
 * A class to represent a single playing card.
 */

public class Card {
private String color;
private String rank;
private int point;

    public Card(String color, String rank, int point) {
        this.color = color;
        this.rank = rank;
        this.point = point;
    }
    
    public String getColor() {
        return this.color;
    }
    
    public String getRank() {
        return this.rank;
    }
    
    public int getPointValue() {
        return this.point;
    }
}   