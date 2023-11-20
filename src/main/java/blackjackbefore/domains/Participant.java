package blackjackbefore.domains;

public abstract class Participant {
    private Cards cards;

    public Participant() {
        this.cards = new Cards();
    }

    public Cards getCards() {
        return cards;
    }

    public int getCardsSum() {
        return cards.getScoreSum();
    }

    public void provideCard(Card card) {
        this.cards.addCard(card);
    }
}
