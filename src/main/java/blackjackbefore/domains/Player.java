package blackjackbefore.domains;

import blackjackbefore.view.InputView;
import blackjackbefore.view.Printer;


public class Player extends Participant {
    public static final int LIMIT_MORE_CARD_SUM = 21;
    private int amount;

    public Player(String name) {
        super(name);
        this.amount=0;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public void printInitCards() {
        Printer.printCards(this, this.getCards().getSize());
    }

    @Override
    public boolean isProvideMoreCard() {
        if (this.getCardsSum() > LIMIT_MORE_CARD_SUM) return false;
        return InputView.askForAdditionalCard(super.getName());

    }
    @Override
    public void getMoreCard(CardDispenser cardDispenser) {
        //1. 21초과할때까지 카드를 받을 수 있음
        while (isProvideMoreCard()) {
            this.provideCard(cardDispenser.getRandomOneCard());
            this.printInitCards();
        }
    }

    public void initBetAmount() {
        this.amount = InputView.askBetAmount(super.getName());
    }

    public void multiplyAmount(double multiplyNumer) {
        this.amount = Double.valueOf(this.amount * multiplyNumer).intValue();
    }
}
