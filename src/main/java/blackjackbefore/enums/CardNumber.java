package blackjackbefore.enums;

public enum CardNumber {
    ACE("A",1),
    TWO("2",2),
    THREE("3",3),
    FOUR("4",4),
    FIVE("5",5),
    SIX("6",6),
    SEVEN("7",7),
    EIGHT("8",8),
    NINE("9",9),
    JACK("J",10),
    QUEEN("Q",10),
    KING("K",10)
    ;

    private final String noticeName;
    private final int score;


    CardNumber(String noticeName, int score) {
        this.noticeName = noticeName;
        this.score = score;
    }

    public String getNoticeName() {
        return noticeName;
    }

    public int getScore() {
        return score;
    }

    public static CardNumber getRandomNumber() {
        return values()[(int)(Math.random()*values().length)];
    }
}
