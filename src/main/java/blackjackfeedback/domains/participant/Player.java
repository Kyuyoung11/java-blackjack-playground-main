package blackjackfeedback.domains.participant;


public class Player extends Participant{
    String name;
    int amount;

    public Player(String name, int amount) {
        this.name = name;
        this.amount = amount;
    }
}
