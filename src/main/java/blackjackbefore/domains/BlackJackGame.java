package blackjackbefore.domains;

import blackjackbefore.view.Printer;

import java.util.ArrayList;
import java.util.List;

public class BlackJackGame {
    private final List<Participant> participants;
    private final CardDispenser cardDispenser;

    public BlackJackGame(List<Participant> participants) {
        this.participants = new ArrayList<>();
        this.cardDispenser = new CardDispenser();
        this.participants.add(new Dealer());
        this.participants.addAll(participants);
    }

    public void initGame() {
        //1. 딜러, 플레이어 카드 2장 지급
        for (int i=0; i<2; i++) {
            participants.forEach(participant -> participant.provideCard(cardDispenser.getRandomOneCard()));
        }

        //2. 지급 결과 Print
        Printer.printInitCards(participants);

        //3. 지급 결과 집계
        AmountCalculator.checkInitCards(participants);

    }

    public void getMoreCard() {
        participants.forEach(participant-> participant.getMoreCard(cardDispenser));
    }

    public void setBetAmount() {
        participants.stream()
                .filter(participant -> participant.getClass().equals(Player.class))
                .forEach(participant -> ((Player) participant).initBetAmount());
        System.out.println();
    }

    public void calculateScore() {
        participants.forEach(Printer::printScore);
    }

    public void calculateAmount() {

    }
}
