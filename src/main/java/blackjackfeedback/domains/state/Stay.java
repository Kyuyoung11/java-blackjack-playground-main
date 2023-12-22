package blackjackfeedback.domains.state;

import blackjackfeedback.domains.card.Cards;

public class Stay extends Finished{

    public Stay(Cards cards) {
        super(cards);
    }

    @Override
    public double earningRate() {
        return 1;
    }
}
