package blackjackbefore.domains;

import java.util.List;

public class Player {
    private String name;
    private Cards cards;

    public Player(String name) {
        this.name = name;
        this.cards = new Cards();
    }

    public String getName() {
        return name;
    }

    public Cards getCards() {
        return cards;
    }
}
