package blackjackfeedback.domains.participant;


import blackjackfeedback.domains.card.Cards;
import blackjackfeedback.domains.state.Blackjack;
import blackjackfeedback.domains.state.Hit;
import blackjackfeedback.domains.state.State;

public abstract class Participant {
    private static final int BLACKJACK_NUMBER = 21;

    State state;


    public void provideInitCards(Cards cards) {
        if (cards.sum() == BLACKJACK_NUMBER) {
            state = new Blackjack(cards);
            return;
        }

        state = new Hit(cards);
    }

    public State getState() {
        return state;
    }
}
