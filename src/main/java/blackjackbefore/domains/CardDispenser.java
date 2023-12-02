package blackjackbefore.domains;

import blackjackbefore.enums.CardNumber;
import blackjackbefore.enums.CardShape;


public class CardDispenser {
    private Cards providedCard;

    public CardDispenser() {
        providedCard = new Cards();
    }

    public Card getRandomOneCard() {
        CardNumber number = CardNumber.getRandomNumber();
        CardShape shape = CardShape.getRandomNumber();
        Card card = new Card(shape, number);
        if(isContain(card)) {
            return getRandomOneCard();
        }
        this.providedCard.addCard(card);
        return card;
    }

    public boolean isContain(Card card) {
        return this.providedCard.isContain(card);
    }



}
