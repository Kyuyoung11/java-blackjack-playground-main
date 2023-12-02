package blackjackbefore.domains;

public abstract class Participant {
    private Cards cards;
    private String name;

    public Participant(String name) {
        this.cards = new Cards();
        this.name = name;
    }

    public Cards getCards() {
        return cards;
    }
    public String getName() {
        return name;
    }


    public int getCardsSum() {
        return cards.getScoreSum();
    }

    public void provideCard(Card card) {
        this.cards.addCard(card);
    }

    public abstract void printInitCards();

    public abstract boolean isProvideMoreCard();

    public abstract void getMoreCard(CardDispenser cardDispenser);
}
