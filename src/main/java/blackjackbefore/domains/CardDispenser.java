package blackjackbefore.domains;

import blackjackbefore.enums.CardNumber;
import blackjackbefore.enums.CardShape;


public class CardDispenser {
    public String getRandomOneCard() {
        String shape = CardShape.getRandomNumber().getNoticeName();
        String number = CardNumber.getRandomNumber().getNoticeName();

        return number+shape;
    }
}
