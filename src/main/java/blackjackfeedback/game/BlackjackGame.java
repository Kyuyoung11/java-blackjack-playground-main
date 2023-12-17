package blackjackfeedback.game;

import blackjackfeedback.domains.card.Deck;
import blackjackfeedback.domains.participant.Dealer;
import blackjackfeedback.domains.participant.Players;
import blackjackfeedback.domains.participant.Player;
import blackjackfeedback.view.InputView;
import blackjackfeedback.view.ResultView;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class BlackjackGame {
    InputView inputView;
    ResultView resultView;

    public void play() {
        //초기 설정
        Dealer dealer = new Dealer();
        Deck deck = new Deck();
        deck.doShuffle();

        //1. 플레이어, 베팅금액 입력
        Players players = new Players(_convertToPlayer(inputView.getPlayersInput()));

        //2. 카드 지급
        dealer.provideInitCards();
        resultView.printProvideCards(players);




    }

    private List<Player> _convertToPlayer(String playersInput) {
        return Arrays.stream(playersInput.split(","))
                .map(name -> new Player(name, inputView.getPlayerAmount(name)))
                .collect(Collectors.toList());
    }
}
