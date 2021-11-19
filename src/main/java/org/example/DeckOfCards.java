package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collections;

@Component
public class DeckOfCards {

    private ArrayList<Card> deck;

    public DeckOfCards() {
        this.deck = this.myDeck();

    }
@Bean
    private ArrayList<Card> myDeck() {
        ArrayList<Card> myDeck = new ArrayList<>();
        for (Suit suit :Suit.values()) {
            for (Rank rank: Rank.values()) {
                myDeck.add(new Card(suit, rank));
            }
        }
        return myDeck;
    }

    public void shuffle(){
        Collections.shuffle(this.deck);
        System.out.println("in shuffle" + deck);
    }
}
