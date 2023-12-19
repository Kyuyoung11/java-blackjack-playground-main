package blackjackfeedback;

import blackjackfeedback.domains.card.Cards;
import blackjackfeedback.domains.card.PlayingCard;
import blackjackfeedback.domains.participant.Player;
import blackjackfeedback.domains.state.Blackjack;
import blackjackfeedback.domains.state.Hit;
import blackjackfeedback.enums.Denomination;
import blackjackfeedback.enums.Suit;
import blackjackfeedback.view.ResultView;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ParticipantTest {

    @Test
    void 생성자() {
        Player p1 = new Player("p1", 100);

        assertTrue(p1.getState() instanceof Hit);

    }


    @Test
    void 시작카드지급_hit() {
        Player p1 = new Player("p1", 100);

        PlayingCard c1 = new PlayingCard(Denomination.SIX, Suit.CLUBS);
        p1.draw(c1);

        PlayingCard c2 = new PlayingCard(Denomination.ACE, Suit.HEARTS);
        p1.draw(c2);

        ResultView resultView = new ResultView();
        resultView.printOwnedCards(p1);

        assertEquals(p1.getScoreSum(),17);
        assertTrue(p1.getState() instanceof Hit);
    }

    @Test
    void 시작카드지급_blackjack() {

        Player p1 = new Player("p1", 100);
        PlayingCard c1 = new PlayingCard(Denomination.KING, Suit.CLUBS);
        p1.draw(c1);

        PlayingCard c2 = new PlayingCard(Denomination.ACE, Suit.HEARTS);
        p1.draw(c2);

        ResultView resultView = new ResultView();
        resultView.printOwnedCards(p1);

        assertEquals(p1.getScoreSum(),21);
        assertTrue(p1.getState() instanceof Blackjack);
    }
}
