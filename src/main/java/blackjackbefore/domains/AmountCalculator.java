package blackjackbefore.domains;

import blackjackbefore.enums.CardsStatus;

import java.util.List;

public class AmountCalculator {
    private static final int BLACK_JACK_NUMBER = 21;
    public static void calculateAmount(List<Participant> participants) {
        CardsStatus dealerStatus = _getDealerCardsStatus(participants);

        if (CardsStatus.BURST == dealerStatus) return;
        if (CardsStatus.BLACKJACK == dealerStatus) {
            participants.stream()
                    .filter(participant -> participant.getClass().equals(Player.class))
                    .filter(participant -> CardsStatus.isNORMAL(participant.getCardsSum()))
                    .forEach(participant -> ((Player) participant).setAmount(0));
            return;
        }



    }

    public static void checkInitCards(List<Participant> participants) {
        double multiplyNumber = _getMultiplyNumber(participants);

        participants.stream()
                .filter(participant -> participant.getClass().equals(Player.class))
                .filter(participant -> CardsStatus.isBLACKJACK(participant.getCardsSum()))
                .forEach(participant -> ((Player) participant).multiplyAmount(multiplyNumber));
    }

    private static CardsStatus _getDealerCardsStatus(List<Participant> participants) {
        //1. 딜러
        Dealer dealer = (Dealer) participants.stream()
                .filter(participant -> participant.getClass().equals(Dealer.class))
                .findFirst()
                .get();

        //2. 딜러 카드 상태
        return CardsStatus.getCardsStatus(dealer.getCardsSum());
    }

    private static double _getMultiplyNumber(List<Participant> participants) {
        if (CardsStatus.BLACKJACK == _getDealerCardsStatus(participants)) {
            return 1.0;
        }
        return 1.5;
    }
}
