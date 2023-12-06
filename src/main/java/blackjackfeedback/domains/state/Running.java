package blackjackfeedback.domains.state;

public abstract class Running extends Started{

    @Override
    public boolean isFinished() {
        return false;
    }

    @Override
    public double profit(double rate) {
        return 0;
    }
}
