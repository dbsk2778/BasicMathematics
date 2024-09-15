package 기초수학.지수와로그.Practice;

public class Practice {

    // Math 함수 없이 제곱과 제곱근을 구하기
    public static void main(String[] args) {
        System.out.println(pow(2, 3));
        System.out.println(pow(2, -3));
        System.out.println(sqrt(16));
        System.out.println(sqrt(8));
    }

    // pow(밑, 지수)
    public static double pow(int a, double b) {
        double result = 1;
        boolean isMinus = false;

        if (b == 0) {
            return 1;
        } else if (b < 0) {
            b *= -1;  // 들어온 음수 지수를 양수로 만들어 주기
            isMinus = true;
        }

        for (int i = 0; i < b; i++) {
            result *= a;
        }

        return isMinus ? 1 / result : result;
    }

    // 제곱근을 구하기 위한 반복적인 근사 계산 방식으로, ewton-Raphson 방법(Newton's method)에 기반한 알고리즘

    public static double sqrt(int a) {
        double result = 1; // 초기 추정값 x₀을 1로 설정

        // 10번 반복하면서 Newton-Raphson 방법을 사용해 근을 찾음
        for (int i = 0; i < 10; i++) {
            // xₙ₊₁ = (xₙ + a / xₙ) / 2
            result = result + (a / result) / 2;
        }

        return result;  // // 근사된 제곱근 반환
    }
}
