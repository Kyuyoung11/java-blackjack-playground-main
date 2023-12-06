package blackjackfeedback.domains.state;

import blackjackfeedback.domains.card.Cards;
import blackjackfeedback.domains.card.PlayingCard;

public abstract class Running extends Started{
    protected Running(Cards cards) {
        super(cards);
    }

    public boolean isFinished() {
        return true;
    }

    public double profit(double rate) {
        return 0;
    }

    public abstract State draw(final PlayingCard card);

    public abstract State stay();
}
