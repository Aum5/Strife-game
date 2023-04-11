package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {

    private List<Card> cards;
    private int currentCardIndex;

    public Deck() {
        cards = new ArrayList<>();
        currentCardIndex = 0;
        initializeDeck();
    }

    private void initializeDeck() {
        String[] colors = {"Black", "Red"};
        String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
        int[] points = {14, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};

        for (int i = 0; i < ranks.length; i++) {
            for (String color : colors) {
                Card card = new Card(color, ranks[i], points[i]);
                cards.add(card);
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
        if (currentCardIndex >= cards.size()) {
            throw new RuntimeException("Deck is empty");
        }

        Card card = cards.get(currentCardIndex);
        currentCardIndex++;
        return card;
    }

    public void returnCardToDeck(Card card) {
        cards.add(card);
    }

}
