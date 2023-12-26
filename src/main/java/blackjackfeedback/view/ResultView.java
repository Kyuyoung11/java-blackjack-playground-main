package blackjackfeedback.view;

import blackjackfeedback.domains.card.Cards;
import blackjackfeedback.domains.card.PlayingCard;
import blackjackfeedback.domains.participant.Dealer;
import blackjackfeedback.domains.participant.Participant;
import blackjackfeedback.game.BlackjackPlayers;

import java.util.ArrayList;
import java.util.List;

public class ResultView {
    public void printProvideCards(BlackjackPlayers players) {
        System.out.println("딜러와 " + players.getNames()+"에게 2장의 카드를 나누었습니다.");
    }

    public void printOwnedCards(Participant participant) {
        System.out.println(_convertToCardString(participant));
    }

    public void printOwnedCardsWithScore(Participant participant) {
        System.out.println(_convertToCardString(participant) + " - 결과: " + participant.getScoreSum());
    }

    private String _convertToCardString(Participant participant) {
        return participant.getName() + "카드 : " + participant.getState().cards().convertToString();
    }

    public void printOwnedCardsCount(Participant participant, int count) {
        List<PlayingCard> slicedCards = new ArrayList<>();

        for (int i =0; i<count; i++) {
            PlayingCard card = participant.getState().cards().getCardIndex(i);
            slicedCards.add(card);
        }

        Cards cards = new Cards(slicedCards);
        System.out.println(participant.getName() + "카드 : " + cards.convertToString());

    }

    public void printDealerGetMoreCard() {
        System.out.println("딜러는 16이하라 한장의 카드를 더 받았습니다.");
    }

    public void printProfit(Dealer dealer, BlackjackPlayers players) {
        int playerProfitsSum = players.getTotalSum();
        System.out.println("## 최종 수익");
        System.out.println(dealer.getName() + ": " + playerProfitsSum * (-1));
        players.forEach(player -> System.out.println(player.getName() + " : " + player.getAmount()));
    }
}
