package blackjackbefore.view;

import blackjackbefore.domains.Dealer;
import blackjackbefore.domains.Participant;
import blackjackbefore.domains.Player;

import java.util.List;
import java.util.stream.Collectors;

public class Printer {
    public static void printInitCards(List<Participant> participants) {
        String players = participants.stream()
                .filter(participant->participant instanceof Player)
                .map(participant -> ((Player) participant).getName())
                .collect(Collectors.joining(","));
        System.out.println("딜러와 "+players+"에게 2장의 카드를 나누었습니다.");
        participants.forEach(Participant::printInitCards);
    }
}
