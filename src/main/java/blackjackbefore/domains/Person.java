package blackjackbefore.domains;

public abstract class Person {
    private Cards cards;

    public Person() {
        this.cards = new Cards();
    }

    public Cards getCards() {
        return cards;
    }
}
