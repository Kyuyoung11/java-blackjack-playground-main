package blackjackfeedback.domains.participant;

import java.util.List;
import java.util.stream.Collectors;

public class Players {
    List<Player> players;

    public Players(List<Player> players) {
        this.players = players;
    }

    public String getNames() {
        return players.stream()
                .map(Player::getName)
                .collect(Collectors.joining(","));
    }
}
