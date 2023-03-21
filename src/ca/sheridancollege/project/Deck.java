/**
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 * Add your name as an author and the date!
 */
package ca.sheridancollege.project;

import java.util.Collections;
import java.util.List;

public class Deck {
    private List<Card> cards;

    public Deck() {
        // TODO: Initialize the cards in the deck based on the rules of the game being played
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

    public Card drawCard() {
        if (cards.isEmpty()) {
            throw new IllegalStateException("Deck is empty, cannot draw a card");
        }
        return cards.remove(0);
    }

    public void returnCardToDeck(Card card) {
        cards.add(card);
    }
}