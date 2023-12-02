package blackjackbefore.domains;

import blackjackbefore.view.Printer;

public class Dealer extends Participant {

    public static final int LIMIT_MORE_CARD_SUM = 16;
    public Dealer() {
        super("딜러");
    }

    @Override
    public void printInitCards() {
        Printer.printCards(this,1);
    }


    @Override
    public boolean isProvideMoreCard() {
        return this.getCardsSum() <= LIMIT_MORE_CARD_SUM;
    }

    @Override
    public void getMoreCard(CardDispenser cardDispenser) {
        this.provideCard(cardDispenser.getRandomOneCard());
    }
}
