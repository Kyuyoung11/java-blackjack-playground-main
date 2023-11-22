package blackjackbefore.domains;

import blackjackbefore.view.Printer;

import java.util.ArrayList;
import java.util.List;

public class BlackJackGame {
    private List<Participant> participants;
    private static final CardDispenser cardDispenser = new CardDispenser();

    public BlackJackGame(List<Participant> participants) {
        this.participants = new ArrayList<>();
        this.participants.add(new Dealer());
        this.participants.addAll(participants);
    }

    public void initGame() {
        //1. 딜러, 플레이어 카드 2장 지급
        for (int i=0; i<2; i++) {
            participants.forEach(player -> player.provideCard(cardDispenser.getRandomOneCard()));
        }

        //2. 지급 결과 Print
        Printer.printInitCards(participants);
    }
    
    public void getMoreCard() {
        participants.stream()
                .filter(Participant::isProvideMoreCard)
                .forEach(participant-> cardDispenser.getRandomOneCard());
    }
}
