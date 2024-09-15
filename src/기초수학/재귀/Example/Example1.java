package 기초수학.재귀.Example;

public class Example1 {
    /*
        점화식의 유형을 파악하고 재귀함수로 구현할 수 있는 방법을 배우자 !!
        재귀함수는 여러 문제를 매우 편리하게 풀 수 있는 방법을 제공한다 !!

        1. 점화식 (Recurrence) : 어떤 수열의 일반항을 그 이전의 항들을 이용하여 정의한 식
           ex. 피보나치 수열 (1, 1, 2, 3, 5, 8, 13, ...)
           = 피보나치 수열의 점화식은 F1 = F2 = 1, Fn+2 = Fn+1 + Fn

        2. 재귀함수 : 어떤 함수가 자기 자신을 다시 호출하여 작업을 수행하는 방식
           재귀함수는 어떻게 보면 자기 자신을 계속 호출하는거니까 반복문이다, 그러므로 종료 조건이 꼭 있어야 함!!
           반환타입 함수이름 (매개변수) {
               종료 조건
               ...
               함수이름 (매개변수)
           }
    */

    public static void main(String[] args) {
        System.out.println(example1(4));
        System.out.println(recursionExample1(4));
    }

    // 점화식 재귀함수 연습 1 (1, 3, 9, 27 ... 의 계속 3을 곱해준 n번째까지의 값을 구하기)
    // 점화식 -> 반복문, 재귀함수
    public static int example1(int n) {
        int result = 1;
        for (int i = 0; i < n; i++) {
            if (i > 0) {
                result *= 3;
            }
        }
        return result;
    }

    // 점화식 a(n+1) = 3 * a(n)
    public static int recursionExample1(int n) {
        if (n == 1) {
            return 1;
        }
        return 3 * recursionExample1(n - 1);
    }
}
