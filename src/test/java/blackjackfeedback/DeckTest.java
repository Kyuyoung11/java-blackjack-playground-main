package blackjackfeedback;

import blackjackfeedback.domains.card.Deck;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DeckTest {
    @Test
    void 생성자_52장() {
        Deck deck = new Deck();
        assertEquals(52, deck.getSize());
    }
}
