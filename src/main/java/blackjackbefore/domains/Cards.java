package blackjackbefore.domains;

import java.util.ArrayList;
import java.util.List;

public class Cards {
    //일급컬렉션으로 안씀
    private List<Card> cards;

    public Cards() {
        this.cards =new ArrayList<>();
    }

    public Cards(List<Card> cards) {
        this.cards = cards;
    }

    public boolean isContain(Card card) {
        return cards.contains(card);
    }
}
