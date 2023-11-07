package nextstep.fp;

public class EvenConditional implements Conditional{
    @Override
    public boolean test(Integer number) {
        return number%2==0;
    }
}
