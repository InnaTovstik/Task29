package org.example;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class DeckOfCards {

    private final List<Card> deck;

    public DeckOfCards(List<Card> cards) {
        deck = new LinkedList<>(cards);
    }

    public void shuffle(){
        Collections.shuffle(deck);
    }

    @Override
    public String toString() {
        return "Deck" + deck;
    }
}
