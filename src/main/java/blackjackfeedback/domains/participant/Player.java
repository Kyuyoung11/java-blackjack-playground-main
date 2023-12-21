package blackjackfeedback.domains.participant;


public class Player extends Participant{
    int amount;

    public Player(String name, int amount) {
        super(name);
        this.amount = amount;
    }
    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
