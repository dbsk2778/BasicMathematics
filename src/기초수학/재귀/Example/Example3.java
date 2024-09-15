package 기초수학.재귀.Example;

import java.util.ArrayList;
import java.util.List;

public class Example3 {
    public static void main(String[] args) {
        System.out.println(example(6));
        System.out.println(recursionExample3(6));
        System.out.println(enhancedRecursionExample(6));

        fibonacciesList.add(1); // Fibonacci(1)
        fibonacciesList.add(1); // Fibonacci(2)
        System.out.println(enhancedRecursionExample2(6));
    }

    // 점화식 재귀함수 연습 3
    // 피보나치 수열에서의 n번째 수 구하기
    public static int example(int n) {
        int a1 = 1;
        int a2 = 1;
        int result = 1;

        if (n >= 3) {
            for (int i = 2; i < n; i++) {
                result = a1 + a2;
                a1 = a2;
                a2 = result;
            }
        }
        return result;
    }


    // 점화식 a(n) = a(n-1) + a(n-2)
    public static int recursionExample3(int n) {
        if (n == 1 || n == 2) { // n < 3
            return 1;
        }
        return recursionExample3(n - 1) + recursionExample3(n - 2);
    }

    // 같은 연산을 줄이는 방법 - int 배열 사용
    static int[] fibonaccies = new int[10001];

    public static int enhancedRecursionExample(int n) {
        if (n < 3) {
            return 1;
        }
        if (fibonaccies[n] != 0) {
            return fibonaccies[n];
        }
        int result = enhancedRecursionExample(n - 1) + enhancedRecursionExample(n - 2);
        fibonaccies[n] = result;
        return result;
    }

    // 리스트 사용
    static List<Integer> fibonacciesList = new ArrayList<>();

    public static int enhancedRecursionExample2(int n) {
        // List의 크기보다 큰 인덱스에 접근하려면 값을 계산해 추가
        if (fibonacciesList.size() > n) {
            return fibonacciesList.get(n);  // 이미 계산된 값을 반환
        }
        // 재귀 호출로 Fibonacci 값을 계산
        int result = enhancedRecursionExample(n - 1) + enhancedRecursionExample(n - 2);
        // 계산된 값을 List에 추가
        fibonacciesList.add(result);
        return result;
    }
}
