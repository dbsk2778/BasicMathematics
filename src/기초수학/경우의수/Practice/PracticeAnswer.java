package 기초수학.경우의수.Practice;

import java.util.ArrayList;
import java.util.List;

public class PracticeAnswer {

    public static void main(String[] args) {
        System.out.println("gcd: " + getGCD(10, 6));
        System.out.println("lcm: " + getLCM(10, 6));
    }

    // 약수: 나머지가 발생하지 않는 수
    public static List<Integer> getDivisor(int num) {
        List<Integer> result = new ArrayList<>();

        // 절반까지만 for문 돌리기
        for (int i = 1; i <= (int) num / 2; i++) {
            if (num % i == 0) {
                result.add(i);
            }
        }
        // 자기 자신 넣어주기
        result.add(num);

        return result;
    }

    // 최대 공약수: the Greatest Common Denominator
    // 숫자 여러 개의 공통된 약수 중 가장 큰 값 -> 재귀로 풀면 이것보다 더 효율적임
    public static int getGCD(int numA, int numB) {
        int gcd = -1;

        // 각각의 약수 구하기
        List<Integer> divisorsA = getDivisor(numA);
        List<Integer> divisorsB = getDivisor(numB);

        for (int itemA : divisorsA) {
            for (int itemB : divisorsB) {
                if (itemA == itemB) {
                    if (itemA > gcd) gcd = itemA;
                }
            }
        }

        return gcd;
    }

    // 최소 공배수: the Lowest Common Multiple
    // 숫자 여러 개의 공통된 배수들 중 가장 작은 값
    public static int getLCM(int numA, int numB) {
        int lcm = -1;
        int gcd = getGCD(numA, numB);

        if (gcd != -1) {
            lcm = numA * numB / gcd;
        }
        return lcm;
    }
}
