package blackjackfeedback.domains.state;

import blackjackfeedback.domains.card.Cards;

public abstract class Started implements State{
    public final Cards cards;

    protected Started(Cards cards) {
        this.cards = cards;
    }

    public Cards cards() {
        return new Cards();
    }
}
