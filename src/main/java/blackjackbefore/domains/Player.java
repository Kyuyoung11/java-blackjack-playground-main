package blackjackbefore.domains;

import blackjackbefore.view.InputView;

import java.util.stream.Collectors;

public class Player extends Participant {
    public static final int LIMIT_MORE_CARD_SUM = 21;
    private String name;
    private int betAmount;

    public Player(String name) {
        super();
        this.name=name;
        this.betAmount=0;
    }
    public String getName() {
        return name;
    }

    @Override
    public void printInitCards() {
        System.out.println(name+"카드: "+String.join(",", this.getCards().getNoticingList()));
    }

    @Override
    public boolean isProvideMoreCard() {
        if (this.getCardsSum() > LIMIT_MORE_CARD_SUM) return false;
        return InputView.askForAdditionalCard(this.name);

    }
    @Override
    public void getMoreCard(CardDispenser cardDispenser) {
        while (isProvideMoreCard()) {
            this.provideCard(cardDispenser.getRandomOneCard());
            this.printInitCards();
        }
    }

    public void setBetAmount() {
        this.betAmount = InputView.askBetAmount(this.name);
    }
}
