package blackjackfeedback.domains.card;

import blackjackfeedback.enums.Denomination;
import blackjackfeedback.enums.Suit;


public class PlayingCard {
    private final Denomination denomination;
    private final Suit suit;

    public PlayingCard(Denomination denomination, Suit suit) {
        this.denomination = denomination;
        this.suit = suit;
    }

    public Denomination getDenomination() {
        return denomination;
    }

    public int getScore() {
        return denomination.getScore();
    }

    public Suit getSuit() {
        return suit;
    }

    public String convertToString() {
        return getScore() + getSuit().getName();
    }
}
