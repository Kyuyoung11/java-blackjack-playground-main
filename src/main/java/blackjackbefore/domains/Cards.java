package blackjackbefore.domains;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Cards {
    //일급컬렉션으로 안씀
    //TODO : 일급컬렉션으로 해볼 시도를 나중에 한번...
    private List<Card> cards;

    public Cards() {
        this.cards =new ArrayList<>();
    }

    public Cards(List<Card> cards) {
        this.cards = cards;
    }


    public boolean isContain(Card card) {
        return getNoticingList().contains(card.convertToNoticing());
    }

    public List<String> getNoticingList() {
        return cards.stream()
                .map(Card::convertToNoticing)
                .collect(Collectors.toList());
    }

    public int getScoreSum() {
        return cards.stream()
                .mapToInt(Card::getScore)
                .sum();
    }

    public void addCard(Card card) {
        this.cards.add(card);
    }
}
