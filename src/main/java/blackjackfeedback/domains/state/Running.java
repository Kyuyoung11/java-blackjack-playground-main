package blackjackfeedback.domains.state;

import blackjackfeedback.domains.card.Cards;

public abstract class Running extends Started{

    public Running(final Cards cards) {
        super(cards);
    }

    @Override
    public boolean isFinished() {
        return false;
    }

    @Override
    public double profit(double amount) {
        // TODO ?
        return 0;
    }
}
