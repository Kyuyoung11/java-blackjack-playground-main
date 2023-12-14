package blackjackfeedback.view;

import java.util.Scanner;

public class InputView {

    public String getPlayersInput() {
        System.out.println("게임에 참여할 사람의 이름을 입력하세요.(쉼표 기준으로 분리)");
        Scanner sc = new Scanner(System.in);
        return sc.next();
    }

    public int getPlayerAmount(String name) {
        System.out.println(name+"의 베팅 금액은?");
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }
}
