package blackjackfeedback.domains.participant;

import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class Players implements Iterable<Player>{
    List<Player> players;

    public Players(List<Player> players) {
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
}
