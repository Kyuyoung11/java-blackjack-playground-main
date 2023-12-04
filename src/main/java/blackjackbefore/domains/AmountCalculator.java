package blackjackbefore.domains;

import blackjackbefore.enums.CardsStatus;

import java.util.List;

public class AmountCalculator {
    private static final int BLACK_JACK_NUMBER = 21;
    public static void calculateAmount(List<Participant> participants) {
        Dealer dealer = _getDealer(participants);

        if (CardsStatus.isBURST(dealer.getCardsSum())) return;
        if (CardsStatus.isBLACKJACK(dealer.getCardsSum())) {
            _changeParticipantsAmount(participants, participant -> CardsStatus.isNORMAL(participant.getCardsSum()), 0);
            return;
        }
        if (CardsStatus.isNORMAL(dealer.getCardsSum())) {
            _changeParticipantsAmount(participants,
                    participant -> CardsStatus.isNORMAL(participant.getCardsSum()) && dealer.getCardsSum() > participant.getCardsSum(),
                    0);
        }



    }

    public static void checkInitCards(List<Participant> participants) {
        double multiplyNumber = _getMultiplyNumber(participants);
        _changeParticipantsAmount(participants, participant->CardsStatus.isBLACKJACK(participant.getCardsSum()), multiplyNumber);
    }

    private static void _changeParticipantsAmount(List<Participant> participants, Conditional conditional, double multiplyNumber) {
        participants.stream()
                .filter(participant -> participant.getClass().equals(Player.class))
                .filter(conditional::scoreFilterCondition)
                .forEach(participant -> ((Player) participant).multiplyAmount(multiplyNumber));
    }

    private static Dealer _getDealer(List<Participant> participants) {
        return (Dealer) participants.stream()
                .filter(participant -> participant.getClass().equals(Dealer.class))
                .findFirst()
                .get();
    }

    private static double _getMultiplyNumber(List<Participant> participants) {
        if (CardsStatus.isBLACKJACK(_getDealer(participants).getCardsSum())) {
            return 1.0;
        }
        return 1.5;
    }
}
