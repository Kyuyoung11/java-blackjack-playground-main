package blackjackfeedback.domains.participant;

public class Dealer extends Participant{
    private static final int DRAW_MAX_NUMBER = 16;

    public Dealer() {
        super("딜러");
    }

    public boolean canDraw() {
        return getScoreSum() <= DRAW_MAX_NUMBER;
    }
}
