package blackjackfeedback.view;

import blackjackfeedback.domains.participant.Players;

public class ResultView {
    public void printProvideCards(Players players) {
        System.out.println("딜러와 " + players.getNames()+"에게 2장의 카드를 나누었습니다.");
    }
}
