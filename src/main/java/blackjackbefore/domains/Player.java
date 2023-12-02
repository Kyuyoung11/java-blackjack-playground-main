package blackjackbefore.domains;

import blackjackbefore.view.InputView;
import blackjackbefore.view.Printer;


public class Player extends Participant {
    public static final int LIMIT_MORE_CARD_SUM = 21;
    private int betAmount;

    public Player(String name) {
        super(name);
        this.betAmount=0;
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
        while (isProvideMoreCard()) {
            this.provideCard(cardDispenser.getRandomOneCard());
            this.printInitCards();
        }
    }

    public void setBetAmount() {
        this.betAmount = InputView.askBetAmount(super.getName());
    }
}
