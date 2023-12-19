package blackjackfeedback.domains.state;

import blackjackfeedback.domains.card.Cards;
import blackjackfeedback.domains.card.PlayingCard;

public interface State {
    public State draw(PlayingCard card);

    public State stay();

    public boolean isFinished();

    public Cards cards();

    public double profit(double amount);
}
