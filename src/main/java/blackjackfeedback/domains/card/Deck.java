package blackjackfeedback.domains.card;


import blackjackfeedback.enums.Denomination;
import blackjackfeedback.enums.Suit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Deck {
    private Cards cards;

    public Deck() {
        this.cards = new Cards(_makeInitDeck());
    }

    private List<PlayingCard> _makeInitDeck() {
        List<PlayingCard> playingCards = new ArrayList<>();

        Arrays.stream(Denomination.values())
                .forEach(d -> Arrays.stream(Suit.values())
                        .forEach(s-> playingCards.add(new PlayingCard(d,s))));

        return playingCards;
    }

    public void doShuffle() {
        this.cards.doShuffle();
    }

    public int getSize() {
        return cards.getSize();
    }




}
