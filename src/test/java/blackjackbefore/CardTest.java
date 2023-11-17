package blackjackbefore;

import blackjackbefore.domains.Card;
import blackjackbefore.enums.CardNumber;
import blackjackbefore.enums.CardShape;
import org.junit.jupiter.api.Test;


public class CardTest {

    @Test
    void 생성자() {
        Card c1 = new Card(CardShape.CLOVER, CardNumber.ACE);
    }
}
