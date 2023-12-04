package blackjackbefore.view;

import blackjackbefore.domains.Player;
import blackjackbefore.enums.YnEnum;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class InputView {

    public static List<Player> getPlayers() {
        Scanner sc = new Scanner(System.in);
        System.out.println("게임에 참여할 사람의 이름을 입력하세요.(쉼표 기준으로 분리)");
        String playersString = sc.next();
        return Arrays.stream(playersString.split(","))
                .map(Player::new)
                .collect(Collectors.toList());
    }

    public static boolean askForAdditionalCard(String name) {
        Scanner sc = new Scanner(System.in);
        System.out.println(name+"은/는 한장의 카드를 더 받겠습니까?(예는 y, 아니오는 n)");
        String yn = sc.next();
        return YnEnum.valueOfYn(yn).getBooleanValue();
    }

    public static int askBetAmount(String name) {
        Scanner sc = new Scanner(System.in);
        System.out.println(name+"의 베팅 금액은?");
        int inputValue = sc.nextInt();
        System.out.println();

        return inputValue;
    }
}
