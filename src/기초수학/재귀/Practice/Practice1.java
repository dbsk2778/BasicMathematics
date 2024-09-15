package 기초수학.재귀.Practice;

public class Practice1 {
    // 팩토리얼을 재귀함수로 구현하시오
    public static void main(String[] args) {
        System.out.println(factorial(5));
        System.out.println(factorial(10));
    }

    // 점화식 a(n) = a * a(n-1)
    public static int factorial(int n) {
        if (n <= 1) return 1;
        return n * factorial(n - 1);
    }
}
