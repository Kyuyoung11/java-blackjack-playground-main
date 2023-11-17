package blackjackbefore.enums;

public enum CardShape {
    HEART("하트"),
    DIAMOND("다이아몬드"),
    SPADE("스페이드"),
    CLOVER("클로버");

    private String noticeName;

    CardShape(String noticeName) {
        this.noticeName = noticeName;
    }

    public String getNoticeName() {
        return noticeName;
    }

    public static CardShape getRandomNumber() {
        return values()[(int)(Math.random()*values().length)];
    }
}
