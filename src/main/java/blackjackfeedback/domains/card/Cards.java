package blackjackfeedback.domains.card;

import java.util.List;

public class Cards {
    private static final int BLACKJACK_NUMBER = 21;
    private List<PlayingCard> cards;
    public Cards(List<PlayingCard> cards) {
        this.cards = cards;
    }

    public void add(PlayingCard card) {
        cards.add(card);
    }

    public boolean isBust() {
        return sum() > BLACKJACK_NUMBER;
    }

    public int sum() {
        return cards.stream()
                .mapToInt(PlayingCard::getScore)
                .sum();
    }
}
