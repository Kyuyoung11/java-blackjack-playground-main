package blackjackfeedback.game;

import blackjackfeedback.domains.participant.Participant;
import blackjackfeedback.domains.participant.Player;
import blackjackfeedback.domains.state.Hit;
import blackjackfeedback.domains.state.Stay;

import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class BlackjackPlayers implements Iterable<Player>{
    List<Player> players;

    public BlackjackPlayers(List<Player> players) {
        this.players = players;
    }

    public String getNames() {
        return players.stream()
                .map(Player::getName)
                .collect(Collectors.joining(","));
    }

    @Override
    public Iterator<Player> iterator() {
        return players.iterator();
    }

    @Override
    public void forEach(Consumer<? super Player> action) {
        Iterable.super.forEach(action);
    }

    public void compareToDealerScore(int dealerScore) {
        //stay상태인게 dealerScore보다 낮으면 bust처리
        this.players.stream()
                .filter(player -> player.getState() instanceof Stay)
                .filter(player -> player.getScoreSum() < dealerScore)
                .forEach(Participant::changeStateToBust);
    }

    public void applyProfit() {
        players.forEach(player -> player.setAmount((int)player.getState().profit(player.getAmount())));
    }
}
