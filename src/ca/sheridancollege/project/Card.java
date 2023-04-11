package ca.sheridancollege.project;

/**
 * A class to represent a single playing card.
 */
public class Card {
    private Deck.Color color;
    private Deck.Rank rank;

    public Card(Deck.Color color, Deck.Rank rank) {
        this.color = color;
        this.rank = rank;
    }

    public Deck.Color getColor() {
        return color;
    }

    public Deck.Rank getRank() {
        return rank;
    }

    public int getPointValue() {
        return rank.getPoints();
    }
}
