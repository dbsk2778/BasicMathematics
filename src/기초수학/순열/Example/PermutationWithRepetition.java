package 기초수학.순열.Example;

// 중복 순열
public class PermutationWithRepetition {

    public static void main(String[] args) {
        System.out.println("for 중복 순열: " + permutationWithRepetition(4, 2));
        System.out.println("Math.pow 중복 순열: " + permutationWithRepetition2(4, 2));
    }

    // 서로 다른 n개 중에 r개를 선택하는 경우의 수 (순서 O, 중복 O) = n의 r 승
    public static int permutationWithRepetition(int n, int r) {
        int result = 1;
        for (int i = 0; i < r; i++) {
            result *= n;
        }
        return result;
    }

    // Math 패키지 사용
    public static int permutationWithRepetition2(int n, int r) {
        return (int) Math.pow(n, r);
    }
}
