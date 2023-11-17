package blackjackbefore;

import blackjackbefore.domains.CardDispenser;
import org.junit.jupiter.api.Test;

public class CardDispenserTest {
    @Test
    void 랜덤카드지급테스트() {
        CardDispenser cardDispenser = new CardDispenser();
        System.out.println(cardDispenser.getRandomOneCard().convertToNoticing());

    }
}
