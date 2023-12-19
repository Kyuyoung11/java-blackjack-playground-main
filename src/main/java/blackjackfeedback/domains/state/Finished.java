package blackjackfeedback.domains.state;

import blackjackfeedback.domains.card.Cards;
import blackjackfeedback.domains.card.PlayingCard;

public abstract class Finished extends Started{

    public Finished(Cards cards) {
        super(cards);
    }

    @Override
    public State draw(PlayingCard card) {
        return null;
    }

    @Override
    public State stay() {
        return null;
    }

    @Override
    public boolean isFinished() {
        return true;
    }

    @Override
    public double profit(double amount) {
        return amount * earningRate();
    }

    public abstract double earningRate();
}
