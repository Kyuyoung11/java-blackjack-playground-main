package blackjackbefore.domains;

public class Player extends Participant {
    private String name;

    public Player(String name) {
        super();
        this.name=name;
    }

    public String getName() {
        return name;
    }
}
