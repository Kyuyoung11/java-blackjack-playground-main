package blackjackbefore;

import blackjackbefore.domains.BlackJackGame;
import blackjackbefore.domains.Player;
import blackjackbefore.view.InputView;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Player> players = InputView.getPlayers();

        BlackJackGame blackJackGame = new BlackJackGame(players);

        //1. 베팅 금액 입력
        blackJackGame.setBetAmount();

        //2. 게임 시작
        blackJackGame.initGame();

        //3. 카드 추가 지급
        blackJackGame.getMoreCard();

        //4. 점수 계산
        blackJackGame.calculateScore();

        //5. 수익 계산
        blackJackGame.calculateAmount();
    }
}
