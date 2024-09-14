package 기초수학.순열.Example;

public class Permutation {
    public static void main(String[] args) {
        System.out.println("팩토리얼 순열: " + permutation(5, 3));
        System.out.println("for문 순열 (효율 더 높음): " + permutation2(5, 3));
    }

    // 서로 다른 n개 중에 r개를 선택하는 경우의 수 = nPr = n! / (n-r)!
    public static int permutation(int n, int r) {
        if (r > n) {
            return 0; // r이 n보다 크면 순열을 구할 수 없으므로 0 반환
        }
        return factorial(n) / factorial(n - r);
    }

    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    // 반복문 permutation (n ~ (n - r + 1) 까지의 곱) -> 이게 factorial 보다 훨씬 효율적
    public static int permutation2(int n, int r) {
        int result = 1;
        for (int i = n; i >= n - r + 1; i--) {
            result *= i;
        }
        return result;
    }
}
