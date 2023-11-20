package blackjackbefore;

import blackjackbefore.domains.Card;
import blackjackbefore.domains.Cards;
import blackjackbefore.enums.CardNumber;
import blackjackbefore.enums.CardShape;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class CardsTest {

    Card c1 = new Card(CardShape.CLOVER, CardNumber.FIVE);
    Card c2 = new Card(CardShape.DIAMOND, CardNumber.ACE);

    Cards cards = new Cards(Arrays.asList(c1,c2));

    @Test
    void 생성자테스트() {

        Cards cards = new Cards(Arrays.asList(c1,c2));
    }

    @Test
    void contains테스트() {
        Card testCard = new Card(CardShape.DIAMOND, CardNumber.ACE);
        assertTrue(cards.isContain(testCard));
    }
}
