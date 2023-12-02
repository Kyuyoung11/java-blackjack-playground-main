package blackjackbefore;

import blackjackbefore.domains.CardDispenser;
import org.junit.jupiter.api.Test;

public class CardDispenserTest {
    @Test
    void 랜덤카드지급테스트() {
        CardDispenser cardDispenser = new CardDispenser();
        System.out.println(cardDispenser.getRandomOneCard().convertToNoticing());

    }

    @Test
    void 랜덤카드지급테스트_10장() {
        CardDispenser cardDispenser = new CardDispenser();
        for (int i=0; i<10; i++) {
            System.out.println(cardDispenser.getRandomOneCard().convertToNoticing());
        }
    }
}
