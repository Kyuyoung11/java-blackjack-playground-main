package blackjackbefore.domains;

public class Dealer extends Participant {

    public static final int LIMIT_MORE_CARD_SUM = 16;
    public Dealer() {
        super();
    }

    @Override
    public void printInitCards() {
        System.out.println("딜러: " + this.getCards().getNoticingList().get(0));
    }



    //TODO : 이걸 STRATEGY PATTERN으로 적용해볼 시도
    @Override
    public boolean isProvideMoreCard() {
        return this.getCardsSum() <= LIMIT_MORE_CARD_SUM;
    }
}
