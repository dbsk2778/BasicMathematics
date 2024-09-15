package 기초수학.재귀.Example;

public class Example2 {
    public static void main(String[] args) {
        System.out.println(example2(10));
        System.out.println(recursionExample2(10));
    }

    // 점화식 재귀함수 연습 2
    // 1, 2, 3, 4, 5, 6, ... n번째 까지의 합
    public static int example2(int n) {
        int result = 0;

        for (int i = 1; i <= n; i++) {
            result += i;
        }

        return result;
    }

    // 점화식 a(n) = n + a(n-1)
    public static int recursionExample2(int n) {
        if (n == 1) {
            return 1;
        }
        return n + recursionExample2(n - 1);
    }
}
