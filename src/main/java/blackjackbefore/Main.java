package blackjackbefore;

import blackjackbefore.domains.BlackJackGame;
import blackjackbefore.domains.Player;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Player p1 = new Player("pobi");
        Player p2 = new Player("crong");
        Player p3 = new Player("loopy");

        BlackJackGame blackJackGame = new BlackJackGame(Arrays.asList(p1,p2,p3));

        //1. 베팅 금액 입력
        blackJackGame.setBetAmount();

        //2. 게임 시작
        blackJackGame.initGame();

        //3. 카드 추가 지급
        blackJackGame.getMoreCard();

        //4. 점수 계산
        blackJackGame.calculateScore();
    }
}
