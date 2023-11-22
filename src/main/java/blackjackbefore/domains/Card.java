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
        return this.number.getNoticeName()+this.shape.getNoticeName();

    }

    public CardShape getShape() {
        return shape;
    }

    public CardNumber getNumber() {
        return number;
    }

    public int getScore() {
        return number.getScore();
    }
}
