package 기초수학.순열.Example;

public class CircularPermutation {

    public static void main(String[] args) {
        System.out.println("원 순열: " + circularPermutation(3));
    }

    // 원 모양의 테이블에 n개의 원소를 나열하는 경우의 수 = (n-1)!
    public static int circularPermutation(int n) {
        int result = 1;
        for (int i = 1; i <= n - 1; i++) {
            result *= i;
        }
        return result;
    }
}
