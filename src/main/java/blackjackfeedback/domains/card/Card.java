package blackjackfeedback.domains.card;

import blackjackfeedback.enums.Denomination;
import blackjackfeedback.enums.Suit;

public class Card {
    private Denomination denomination;
    private Suit suit;

    public Card(Denomination denomination, Suit suit) {
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
}
