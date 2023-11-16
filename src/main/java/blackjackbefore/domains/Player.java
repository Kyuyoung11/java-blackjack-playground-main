package blackjackbefore.domains;

import java.util.List;

public class Player extends Person{
    private String name;

    public Player(String name) {
        super();
        this.name=name;
    }

    public String getName() {
        return name;
    }
}
