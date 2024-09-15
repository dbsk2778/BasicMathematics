package 기초수학.조합.Example;

public class CombinationWithRepetition {
    public static void main(String[] args) {
        System.out.println("중복 조합: " + combinationWithRepetition(2, 3));
    }

    // 중복조합은 nHr = n+r-1Cr (조합 코드를 작성하고 풀어주면 된다.)
    // 후보 2명, 유권자 3명일 때 무기명 투표 방법
    public static int combinationWithRepetition(int n, int r) {
        return getCombination(n + r - 1, r);
    }

    // nCr일 경우 (n, r) 이렇게 작성해서 호출하고,
    // nHr일 경우 (n+1-2, r) 이렇게 구해주면 된다.
    public static int getCombination(int n, int r) {
        int nPr = 1;
        for (int i = n; i > n - r; i--) {
            nPr *= i;
        }

        int factorial = 1;
        for (int i = 1; i <= r; i++) {
            factorial *= i;
        }

        return nPr / factorial;
    }
}
