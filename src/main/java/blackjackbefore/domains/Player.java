package blackjackbefore.domains;

import java.util.stream.Collectors;

public class Player extends Participant {
    private String name;

    public Player(String name) {
        super();
        this.name=name;
    }
    public String getName() {
        return name;
    }

    @Override
    public void printInitCards() {
        System.out.println(name+"카드: "+String.join(",", this.getCards().getNoticingList()));
    }
}
