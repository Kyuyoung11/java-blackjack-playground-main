package blackjackfeedback.domains.card;


import blackjackfeedback.enums.Denomination;

import java.util.Collections;
import java.util.List;

public class Cards {

    private static final int ACE_DIFFER_NUMBER = 10;
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
        int sum = cards.stream()
                .mapToInt(PlayingCard::getScore)
                .sum();

        if(!_isContainACE()) return sum;

        int sumOfAce11 = sum + ACE_DIFFER_NUMBER;
        if(sumOfAce11 <= BLACKJACK_NUMBER) return sumOfAce11;

        return sum;
    }

    public int getSize() {
        return cards.size();
    }

    public void doShuffle() {
        Collections.shuffle(this.cards);
    }

    public PlayingCard getCardIndex(int index) {
        return cards.get(index);
    }

    private boolean _isContainACE() {
        return this.cards.stream()
                .anyMatch(card->card.getDenomination()== Denomination.ACE);
    }
}
