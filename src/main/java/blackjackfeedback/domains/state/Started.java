package blackjackfeedback.domains.state;


import blackjackfeedback.domains.card.Cards;

public abstract class Started implements State{
    private Cards cards;

    @Override
    public Cards cards() {
        return cards;
    }
}
