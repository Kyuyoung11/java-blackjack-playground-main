package blackjackfeedback;

import blackjackfeedback.domains.card.Cards;
import blackjackfeedback.domains.card.PlayingCard;
import blackjackfeedback.domains.participant.Player;
import blackjackfeedback.domains.state.Blackjack;
import blackjackfeedback.domains.state.Hit;
import blackjackfeedback.enums.Denomination;
import blackjackfeedback.enums.Suit;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ParticipantTest {
    @Test
    void 시작카드지급_hit() {
        Player p1 = new Player("p1", 100);
        PlayingCard c1 = new PlayingCard(Denomination.SIX, Suit.CLUBS);
        PlayingCard c2 = new PlayingCard(Denomination.ACE, Suit.HEARTS);

        p1.provideInitCards(new Cards(Arrays.asList(c1,c2)));
        assertTrue(p1.getState() instanceof Hit);
    }

    @Test
    void 시작카드지급_blackjack() {
        Player p1 = new Player("p1", 100);
        PlayingCard c1 = new PlayingCard(Denomination.KING, Suit.CLUBS);
        PlayingCard c2 = new PlayingCard(Denomination.ACE, Suit.HEARTS);

        p1.provideInitCards(new Cards(Arrays.asList(c1,c2)));
        assertTrue(p1.getState() instanceof Blackjack);
    }
}
