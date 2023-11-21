package blackjackbefore.domains;

public class Dealer extends Participant {
    public Dealer() {
        super();
    }

    @Override
    public void printInitCards() {
        System.out.println("딜러: " + this.getCards().getNoticingList().get(0));
    }
}
