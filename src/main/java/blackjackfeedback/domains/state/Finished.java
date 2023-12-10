package blackjackfeedback.domains.state;

import blackjackfeedback.domains.card.Cards;
import blackjackfeedback.domains.card.PlayingCard;

public abstract class Finished extends Started{
    public Cards cards;

    public Finished(Cards cards) {
        this.cards = cards;
    }

    @Override
    public State draw(PlayingCard playingCard) {
        return null;
    }

    @Override
    public State stay() {
        return null;
    }

    @Override
    public boolean isFinished() {
        return false;
    }

    @Override
    public double profit(double rate) {
        return 0;
    }

    public abstract double earningRate();
}
