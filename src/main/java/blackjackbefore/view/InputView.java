package blackjackbefore.view;

import blackjackbefore.enums.YnEnum;

import java.util.Scanner;

public class InputView {
    public static boolean askForAdditionalCard(String name) {
        Scanner sc = new Scanner(System.in);
        System.out.println(name+"은/는 한장의 카드를 더 받겠습니까?(예는 y, 아니오는 n)");
        String yn = sc.next();
        return YnEnum.valueOfYn(yn).getBooleanValue();
    }

    public static int askBetAmount(String name) {
        Scanner sc = new Scanner(System.in);
        System.out.println(name+"의 베팅 금액은?");
        return sc.nextInt();
    }
}
