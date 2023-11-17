package blackjackbefore.domains;

import blackjackbefore.enums.CardNumber;
import blackjackbefore.enums.CardShape;


public class CardDispenser {
    private Cards providedCard;

    public Card getRandomOneCard() {
        CardNumber number = CardNumber.getRandomNumber();
        CardShape shape = CardShape.getRandomNumber();
        Card card = new Card(shape, number);
        if(!isUniqueCard(card)) {
            getRandomOneCard();
        }

        return card;
    }

    public boolean isUniqueCard(Card card) {
//        return this.providedCard.isContain(card);
        return true;
    }



}
