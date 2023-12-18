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
    private static final int INIT_PROVIDE_CARD_COUNT = 2;
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
        _provideInitCards(dealer, players, deck);


    }

    private List<Player> _convertToPlayer(String playersInput) {
        return Arrays.stream(playersInput.split(","))
                .map(name -> new Player(name, inputView.getPlayerAmount(name)))
                .collect(Collectors.toList());
    }


    /**
     * 시작 카드 지급
     */
    private void _provideInitCards(Dealer dealer, Players players, Deck deck) {
        //1. 딜러 카드 지급
        dealer.provideInitCards(deck.getCountCards(INIT_PROVIDE_CARD_COUNT));

        //2. 플레이어 카드 지급
        players.forEach(player -> player.provideInitCards(deck.getCountCards(INIT_PROVIDE_CARD_COUNT)));

        //3. 프린트
        resultView.printProvideCards(players);
    }

}
