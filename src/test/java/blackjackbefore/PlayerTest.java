package blackjackbefore;

import blackjackbefore.domains.Card;
import blackjackbefore.domains.Player;
import blackjackbefore.enums.CardNumber;
import blackjackbefore.enums.CardShape;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PlayerTest {

    Player p1 = new Player("pobi");

    @Test
    void 생성자() {
        assertEquals(p1.getName(), "pobi");
    }

    @Test
    void provideCardTest() {
        Card card = new Card(CardShape.DIAMOND, CardNumber.EIGHT);
        p1.provideCard(card);
        assertTrue(p1.getCards().isContain(card));
    }
}
