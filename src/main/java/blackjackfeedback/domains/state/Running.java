package blackjackfeedback.domains.state;

import blackjackfeedback.domains.card.Cards;

public abstract class Running extends Started{

    public Cards cards;

    public Running(Cards cards) {
        this.cards = cards;
    }

    @Override
    public boolean isFinished() {
        return false;
    }

    @Override
    public double profit(double rate) {
        return 0;
    }
}
