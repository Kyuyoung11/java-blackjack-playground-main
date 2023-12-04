package blackjackbefore.domains;

import blackjackbefore.view.Printer;

import java.util.ArrayList;
import java.util.List;

public class BlackJackGame {
    /**
     * TODO 피드백 적용과 함께 고칠 부분
     * 1. play() 메소드 안에 Dealer, List<Player>를 분리한 로직
     *   - 시도했을 때 call by reference로 메소드 호출하게 되는 점을 고민해봐야 할듯
     * 2. AmountCalculator 안에서 객체를 수정하지 않도록 하기 (call by reference 방식을 사용하는 것 같음)
     * 3. 일급컬렉션 지키기
     */
    private final List<Participant> participants;
    private final CardDispenser cardDispenser;

    public BlackJackGame(List<Player> participants) {
        this.cardDispenser = new CardDispenser();

        this.participants = new ArrayList<>();
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
        AmountCalculator.calculateAmount(participants);
    }
}
