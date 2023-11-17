package blackjackbefore.domains;

import blackjackbefore.enums.CardNumber;
import blackjackbefore.enums.CardShape;

public class Card {
    private CardShape shape;
    private CardNumber number;

    public Card(CardShape shape, CardNumber number) {
        this.shape = shape;
        this.number = number;
    }

    public String convertToNoticing() {
        return this.shape.getNoticeName()+this.number.getNoticeName();

    }
}
