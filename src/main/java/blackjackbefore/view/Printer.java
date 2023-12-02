package blackjackbefore.view;

import blackjackbefore.domains.Participant;
import blackjackbefore.domains.Player;

import java.util.List;
import java.util.stream.Collectors;

public class Printer {
    public static void printInitCards(List<Participant> participants) {
        String names = participants.stream()
                .map(Participant::getName)
                .collect(Collectors.joining(","));
        System.out.println(names+"에게 2장의 카드를 나누었습니다.");
        participants.forEach(Participant::printInitCards);
        System.out.println();
    }

    public static void printCards(Participant participant, int count) {
        String cards = String.join(",", participant.getCards().getNoticingList(count));
        System.out.println(participant.getName()+"카드: "+cards);

    }

    public static void printScore(Participant participant) {
        String cards = String.join(",", participant.getCards().getNoticingList(participant.getCards().getSize()));
        System.out.print(participant.getName()+"카드: "+cards);
        System.out.println(" - 결과: "+participant.getCardsSum());
    }
}
