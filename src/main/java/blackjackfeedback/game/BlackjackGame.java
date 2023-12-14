package blackjackfeedback.game;

import blackjackfeedback.domains.participant.Dealer;
import blackjackfeedback.domains.participant.Players;
import blackjackfeedback.domains.participant.Player;
import blackjackfeedback.view.InputView;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class BlackjackGame {
    InputView inputView;
    public void play() {
        Dealer dealer = new Dealer();

        Players players = new Players(_convertToPlayer(inputView.getPlayersInput()));


    }

    private List<Player> _convertToPlayer(String playersInput) {
        return Arrays.stream(playersInput.split(","))
                .map(name -> new Player(name, inputView.getPlayerAmount(name)))
                .collect(Collectors.toList());
    }
}
