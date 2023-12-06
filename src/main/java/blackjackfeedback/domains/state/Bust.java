package blackjackfeedback.domains.state;

public class Bust extends Finished{
    @Override
    public double earningRate() {
        return 0;
    }
}
