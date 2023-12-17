package blackjackfeedback.domains.state;


import blackjackfeedback.domains.card.Cards;
import blackjackfeedback.domains.card.PlayingCard;

public abstract class Started implements State{
    private Cards cards;

    @Override
    public Cards cards() {
        return cards;
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
        return false;
    }

    @Override
    public double profit(double rate) {
        return 0;
    }
}
