package blackjackbefore;

import blackjackbefore.domains.BlackJackGame;
import blackjackbefore.domains.Player;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class BlackJackGameTest {

    Player p1 = new Player("pobi");
    Player p2 = new Player("crong");
    Player p3 = new Player("loopy");

    BlackJackGame blackJackGame = new BlackJackGame(Arrays.asList(p1,p2,p3));
    @Test
    void 생성자() {
        BlackJackGame blackJackGame = new BlackJackGame(Arrays.asList(p1,p2,p3));
    }

    @Test
    void initGame() {
        blackJackGame.initGame();
    }

    @Test
    void 점수계산() {
        blackJackGame.calculateScore();
    }
}
