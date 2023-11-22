package blackjackbefore;

import blackjackbefore.domains.Card;
import blackjackbefore.domains.Dealer;
import blackjackbefore.enums.CardNumber;
import blackjackbefore.enums.CardShape;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DealerTest {
    Dealer dealer = new Dealer();

    @Test
    void 카드추가받기테스트_16이하_받아야함() {
        dealer.provideCard(new Card(CardShape.DIAMOND, CardNumber.KING));
        dealer.provideCard(new Card(CardShape.CLOVER, CardNumber.TWO));

        assertTrue(dealer.isProvideMoreCard());

    }

    @Test
    void 카드추가받기테스트_17이상_false() {
        dealer.provideCard(new Card(CardShape.DIAMOND, CardNumber.KING));
        dealer.provideCard(new Card(CardShape.CLOVER, CardNumber.SEVEN));

        assertFalse(dealer.isProvideMoreCard());

    }
}
