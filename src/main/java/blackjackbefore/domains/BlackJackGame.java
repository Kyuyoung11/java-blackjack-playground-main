package blackjackbefore.domains;

import java.util.List;

public class BlackJackGame {
    private List<Player> players;
    private Dealer dealer;
    private Cards cards;

    public BlackJackGame(List<Player> players) {
        this.players = players;
    }

    public void initGame() {
        //1. 딜러 카드 2장 지급

        //2. 플레이어 카드 2장 지급
        players.forEach(player->getOneCard(cards));
    }

    public String getOneCard(Cards cards) {
        return "2클로버";
    }
}
