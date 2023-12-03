package blackjackbefore.enums;

public enum CardsStatus {
    BURST,
    BLACKJACK,
    NORMAL
    ;

    public static CardsStatus getCardsStatus(int sum) {
        if(sum > 21) return BURST;
        if(sum == 21) return BLACKJACK;
        return NORMAL;
    }

    public static boolean isBURST(int sum) {
        return sum>21;
    }

    public static boolean isBLACKJACK(int sum) {
        return sum==21;
    }

    public static boolean isNORMAL(int sum) {
        return sum<21;
    }
}
