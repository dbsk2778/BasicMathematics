package 기초수학.경우의수.Practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Practice {

    /*
        ** 코딩 테스트에서 이를 응용하여 푸는 문제가 나올 수 있다 !!

        약수 구하기, 두 수의 최대 공약수와 최소 공배수 구하기
        활용) 1-10의 수 중 A의 약수 또는 B의 약수인 경우의 수
        활용) 1-10의 수 중 A의 약수이면서 B의 약수인 경우의 수
     */

    // 나의 풀이
    public static void main(String[] args) {
        getDivisor(12);
        System.out.println("gcd: " + getGCD(12, 24));
        System.out.println("lcm: " + getLCM(12, 24));
    }

    // 약수: 나머지가 발생하지 않는 수
    public static List<Integer> getDivisor(int num) {
        List<Integer> divisors = new ArrayList<>();

        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                divisors.add(i);
            }
        }
        divisors.add(num);

        return divisors;
    }

    // 최대 공약수: the Greatest Common Denominator
    // 숫자 여러 개의 공통된 약수 중 가장 큰 값
    public static int getGCD(int numA, int numB) {
        int gcd = -1;
        List<Integer> divisorsA = getDivisor(numA);
        List<Integer> divisorsB = getDivisor(numB);

        for (int i = divisorsA.size() - 1; i >= 0; i--) {
            for (int j = divisorsB.size() - 1; j >= 0; j--) {
                if (Objects.equals(divisorsA.get(i), divisorsB.get(j))) {
                    gcd = divisorsA.get(i);
                    break;
                }
            }

            if (gcd != -1) {
                break;
            }
        }
        return gcd;
    }

    // 최소 공배수: the Lowest Common Multiple
    // 숫자 여러 개의 공통된 배수들 중 가장 작은 값
    // 최대 공약수를 구한 다음에 numA, numB를 곱하고, 최대공약수로 나눠주면 됨
    public static int getLCM(int numA, int numB) {
        return (numA * numB) / getGCD(numA, numB);
    }
}
