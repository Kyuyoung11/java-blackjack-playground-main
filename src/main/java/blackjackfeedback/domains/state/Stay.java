package blackjackfeedback.domains.state;

public class Stay extends Finished{
    @Override
    public double earningRate() {
        return 0;
    }
}
