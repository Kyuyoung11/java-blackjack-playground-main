package blackjackfeedback.game;

import blackjackbefore.enums.YnEnum;
import blackjackfeedback.domains.card.Deck;
import blackjackfeedback.domains.participant.Dealer;
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

    public BlackjackGame() {
        this.inputView = new InputView();
        this.resultView = new ResultView();
    }

    public void play() {

        //초기 설정
        Dealer dealer = new Dealer();
        Deck deck = new Deck();
        deck.doShuffle();

        //1. 플레이어, 베팅금액 입력
        BlackjackPlayers players = new BlackjackPlayers(_convertToPlayer(inputView.getPlayersInput()));

        //2. 카드 지급
        _provideInitCards(dealer, players, deck);

        //3. 카드 추가 지급
        _provideAdditionalCards(dealer, players, deck);

        //4. 점수 집계
        _calculateScore(dealer, players);

        //5. 수익 계산
        _calculateProfit(dealer, players);


    }

    private void _calculateProfit(Dealer dealer, BlackjackPlayers players) {
        if (dealer.getState().isFinished()) return;

        int dealerScore = dealer.getScoreSum();
        players.compareToDealerScore(dealerScore);

        for (Player player : players) {
            System.out.println(player.getName() + player.getState().getClass());
        }
        players.applyProfit();
        resultView.printProfit(dealer, players);

    }

    private void _calculateScore(Dealer dealer, BlackjackPlayers players) {
        //1. 딜러카드 집계 및 출력
        resultView.printOwnedCardsWithScore(dealer);

        //2. 플레이어 카드 집계 및 출력
        players.forEach(player -> resultView.printOwnedCardsWithScore(player));
    }

    private void _provideAdditionalCards(Dealer dealer, BlackjackPlayers players, Deck deck) {
        //1. 플레이어 카드 지급
        players.forEach(player -> provideAdditionalCardForPlayer(player, deck));

        //2. 딜러 카드 지급
        provideAdditionalCardForDealer(dealer, deck);
    }

    public void provideAdditionalCardForDealer(Dealer dealer, Deck deck) {
        if(dealer.canDraw()) {
            dealer.draw(deck.getOneCard());
            resultView.printDealerGetMoreCard();
        }

    }

    public void provideAdditionalCardForPlayer(Player player, Deck deck) {
        //1. Finished 이면 return
        if(player.getState().isFinished()) return;

        //2. player가 추가 카드를 받을 것인지 입력받기
        if(!_isGettingAdditionalCard(player)) {
            player.stay();
            return;
        }

        //3. 추가 카드 지급
        player.draw(deck.getOneCard());

        //4. 출력
        resultView.printOwnedCards(player);

        provideAdditionalCardForPlayer(player, deck);

    }

    private boolean _isGettingAdditionalCard(Player player) {
        String yn = inputView.askForAdditionalCard(player.getName());

        return YnEnum.valueOfYn(yn).getBooleanValue();
    }

    private List<Player> _convertToPlayer(String playersInput) {
        return Arrays.stream(playersInput.split(","))
                .map(name -> new Player(name, inputView.getPlayerAmount(name)))
                .collect(Collectors.toList());
    }


    /**
     * 시작 카드 지급
     */
    private void _provideInitCards(Dealer dealer, BlackjackPlayers players, Deck deck) {
        //1. 딜러 카드 지급
        dealer.provideInitCards(deck.getCountCards(INIT_PROVIDE_CARD_COUNT));

        //2. 플레이어 카드 지급
        players.forEach(player -> player.provideInitCards(deck.getCountCards(INIT_PROVIDE_CARD_COUNT)));

        //3. 프린트
        resultView.printProvideCards(players);

        //4. 카드 보유 프린트
        resultView.printOwnedCardsCount(dealer, 1);
        players.forEach(player-> resultView.printOwnedCards(player));
    }


}
