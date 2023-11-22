package blackjackbefore;

import blackjackbefore.domains.Card;
import blackjackbefore.domains.Player;
import blackjackbefore.enums.CardNumber;
import blackjackbefore.enums.CardShape;
import org.junit.jupiter.api.Test;

import java.io.*;

import static org.junit.jupiter.api.Assertions.*;

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

    @Test
    void 카드추가받기테스트_21미만_입력TRUE() {

        String input = "y";
        OutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        p1.provideCard(new Card(CardShape.DIAMOND, CardNumber.KING));
        p1.provideCard(new Card(CardShape.CLOVER, CardNumber.TWO));

        assertTrue(p1.isProvideMoreCard());

    }

    @Test
    void 카드추가받기테스트_21미만_입력false() {

        String input = "n";
        OutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        p1.provideCard(new Card(CardShape.DIAMOND, CardNumber.KING));
        p1.provideCard(new Card(CardShape.CLOVER, CardNumber.TWO));

        assertFalse(p1.isProvideMoreCard());

    }
    @Test
    void 카드추가받기테스트_21이상() {

        String input = "n";
        OutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        p1.provideCard(new Card(CardShape.DIAMOND, CardNumber.NINE));
        p1.provideCard(new Card(CardShape.CLOVER, CardNumber.TWO));
        p1.provideCard(new Card(CardShape.CLOVER, CardNumber.JACK));

        assertFalse(p1.isProvideMoreCard());

    }

}
