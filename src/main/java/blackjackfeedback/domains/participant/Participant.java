package blackjackfeedback.domains.participant;


import blackjackfeedback.domains.card.Cards;
import blackjackfeedback.domains.card.PlayingCard;
import blackjackfeedback.domains.state.Hit;
import blackjackfeedback.domains.state.State;

public abstract class Participant {

    protected State state;
    protected String name;

    public Participant(String name) {
        this.name = name;
        this.state = new Hit(new Cards());
    }

    public String getName() {
        return name;
    }

    public State getState() {
        return state;
    }

    public void draw(PlayingCard card) {
        this.state = this.state.draw(card);
    }

    public void stay() {
        this.state = this.state.stay();
    }

    public int getScoreSum() {
        return this.state.cards().sum();
    }



}
