package blackjackfeedback.domains.state;

import blackjackfeedback.domains.card.PlayingCard;

public class Hit extends Running {

    @Override
    public State draw(PlayingCard playingCard) {
        return null;
    }

    @Override
    public State stay() {
        return null;
    }
}