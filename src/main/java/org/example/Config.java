package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class Config {

    @Bean
    public Card card1() {
        return new Card(Suit.CLUBS, Rank.JACK);
    }

    @Bean
    public Card card2() {
        return new Card(Suit.DIAMONDS, Rank.KING);
    }

    @Bean
    public Card card3() {
        return new Card(Suit.SPADES, Rank.SIX);
    }

    @Bean
    public Card card4() {
        return new Card(Suit.HEARTS, Rank.TEN);
    }

    @Bean
    public DeckOfCards deck(List<Card> cards) {
        return new DeckOfCards(cards);
    }
}