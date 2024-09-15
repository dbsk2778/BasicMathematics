package 기초수학.순열.Example;

import java.util.stream.IntStream;

public class Factorial {

    public static void main(String[] args) {
        System.out.println("메모이제이션 팩토리얼: " + factorial(5));
        System.out.println("for문 팩토리얼: " + factorial2(5));
        System.out.println("stream 팩토리얼: " + factorial3(5));
    }

    static int[] arr = new int[10001];

    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        if (arr[n] != 0) {
            // 이미 계산된 값이 있는 경우 메모이제이션 사용
            return arr[n];
        }

        arr[n] = n * factorial(n - 1); // 재귀적으로 팩토리얼 계산
        return arr[n];
    }

    public static int factorial2(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static int factorial3(int n) {
        // reduce(초기값, 연산)
        return IntStream.range(1, n + 1).reduce(1, (x, y) -> (x * y));
    }
}
