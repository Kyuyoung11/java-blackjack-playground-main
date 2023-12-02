package blackjackbefore;

import blackjackbefore.domains.BlackJackGame;
import blackjackbefore.domains.Card;
import blackjackbefore.domains.Player;
import blackjackbefore.enums.CardNumber;
import blackjackbefore.enums.CardShape;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class BlackJackGameTest {

    Player p1 = new Player("pobi");
    Player p2 = new Player("crong");
    Player p3 = new Player("loopy");

    BlackJackGame blackJackGame = new BlackJackGame(Arrays.asList(p1,p2,p3));

    @BeforeEach
    void setUp() {

        p1.provideCard(new Card(CardShape.CLOVER, CardNumber.FIVE));
        p1.provideCard(new Card(CardShape.DIAMOND, CardNumber.SEVEN));

        p2.provideCard(new Card(CardShape.DIAMOND, CardNumber.KING));

        p3.provideCard(new Card(CardShape.SPADE, CardNumber.ACE));
    }


//    @Test
//    void initGame() {
//        blackJackGame.initGame();
//    }

    @Test
    void 점수계산() {
        blackJackGame.calculateScore();
    }
}
