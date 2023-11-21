package blackjackbefore.view;

import blackjackbefore.domains.Dealer;
import blackjackbefore.domains.Participant;

import java.util.List;

public class Printer {
    public static void printInitCards(List<Participant> participants) {
        participants.forEach(Participant::printInitCards);
    }
}
