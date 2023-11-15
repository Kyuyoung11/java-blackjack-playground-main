package nextstep.fp;

import java.util.List;

public class Lambda {
    public static void printAllOld(List<Integer> numbers) {
        System.out.println("printAllOld");

        for (int number : numbers) {
            System.out.println(number);
        }
    }

    public static void printAllLambda(List<Integer> numbers) {
        System.out.println("printAllLambda");

        numbers.forEach(System.out::println);
    }

    public static void runThread() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello from thread");
            }
        }).start();
    }

    public static int sumAll(List<Integer> numbers, Conditional c) {
        int total = 0;
//        for (int number : numbers) {
//            total += number;
//        }
//        return total;
        return numbers.stream()
                .filter(c::test)
                .mapToInt(Integer::intValue)
                .sum();
    }

    public static int sumAll(List<Integer> numbers) {
        return sumAll(numbers, number->true);
    }

    public static int sumAllEven(List<Integer> numbers) {
//        int total = 0;
//        for (int number : numbers) {
//            if (number % 2 == 0) {
//                total += number;
//            }
//        }
//        return total;
        return sumAll(numbers, number->number%2==0);
    }

    public static int sumAllOverThree(List<Integer> numbers) {
        //1. 원래거
//        int total = 0;
//        for (int number : numbers) {
//            if (number > 3) {
//                total += number;
//            }
//        }
//        return total;

        //2. stream 사용
//        return numbers.stream()
//                .filter(number->number>3)
//                .mapToInt(number->number)
//                .sum();

        //3. 인터페이스 분리
        return sumAll(numbers, number->number>3);

    }
}
