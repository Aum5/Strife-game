package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    private List<Card> cards;
    private int currentCardIndex;

    public enum Color {
        BLACK,
        RED
    }

    public enum Rank {
        ACE(14),
        TWO(2),
        THREE(3),
        FOUR(4),
        FIVE(5),
        SIX(6),
        SEVEN(7),
        EIGHT(8),
        NINE(9),
        TEN(10),
        JACK(11),
        QUEEN(12),
        KING(13);

        private final int points;

        Rank(int points) {
            this.points = points;
        }

        public int getPoints() {
            return points;
        }
    }

    public Deck() {
        cards = new ArrayList<>();
        this.currentCardIndex = 0;

        for (Rank rank : Rank.values()) {
            for (Color color : Color.values()) {
                cards.add(new Card(color, rank));

            }
        }
    }

    public List<Card> getCards() {
        return cards;
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

    public Card drawCard() {
        Card card = cards.get(currentCardIndex);
        currentCardIndex++;
        return card;
    }

    public void returnCardToDeck(Card card) {
        // method to return a card to the deck
    }
}
