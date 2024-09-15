package 기초수학.조합.Example;

public class Combination {
    public static void main(String[] args) {
        System.out.println("조합: " + combination(4, 2));
    }

    // 조합은 nCr = nPr / r!
    // 서로 다른 4명 중 주번 2명을 뽑는 경우의 수
    public static int combination(int n, int r) {
        return permutation(n, r) / factorial(r);
    }

    // 순열 nPr은 n! / (n-r)! = n * (n-1) ... (n - r - 1)
    public static int permutation(int n, int r) {
        int nPr = 1;

        // n 부터 n-r-1까지 곱해주기
        for (int i = n; i > n - r; i--) {
            nPr *= i;
        }

        return nPr;
    }

    public static int factorial(int r) {
        int result = 1;
        for (int i = 1; i <= r; i++) {
            result *= i;
        }

        return result;
    }
}
