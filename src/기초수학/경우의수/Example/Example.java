package 기초수학.경우의수.Example;

import java.util.*;

public class Example {
    /*
        1. 경우의 수: 어떤 사건이 일어날 수 있는 경우의 가짓수, 어떤 사건 A가 일어날 경우의 수 n(A)
           ex. 동전을 던지는 사건: 경우의 수 2 (앞, 뒤)
           ex. 주사위를 던지는 사건: 경우의 수 6 (1 ~ 6)

        2. 합의 법칙: 사건 A 또는 사건 B가 일어날 경우의 수, 사건 A와 사건 B의 합의 법칙 = n(A U B)
           ex. 두 개의 주사위를 던졌을 때 합이 3 또는 4의 배수일 경우의 수
               3, 6, 9, 12 (3의 배수 = 사건 A) / 4, 8, 12 (4의 배수 = 사건 B)
           = n(A) + n(B) - n(A ∩ B) = 12 - 9 - 1 = 20

        3. 곱의 법칙: 사건 A와 사건 B가 동시에 일어날 경우의 수, 사건 A와 사건 B의 곱의 법칙 n(A * B)
           ex. 두 개의 주사위 a, b를 던졌을 때 a는 3의 배수, b는 4의 배수인 경우의 수
               * 사건 A: a가 3의 배수 (3, 6), 사건 B: b가 4의 배수 (4)
           = n(A * B) = n(A) * n(B) = 2 * 1 = 2
     */

    public static void main(String[] args) {
        int[] dice1 = {1, 2, 3, 4, 5, 6};
        int[] dice2 = {1, 2, 3, 4, 5, 6};

        additionRule(dice1, dice2);
        multiplicationRule(dice1, dice2);
    }

    private static void additionRule(int[] dice1, int[] dice2) {
        // 두 개의 주사위를 던졌을 때, 합이 3 또는 4의 배수일 경우의 수
        System.out.println("===== 합의 법칙 =====");

        int nA = 0;
        int nB = 0;
        int nAandB = 0; // 합의 법칙

        // 기본 풀이
        for (int itemA : dice1) {
            for (int itemB : dice2) {
                if ((itemA + itemB) % 3 == 0) {
                    nA += 1;
                }
                if ((itemA + itemB) % 4 == 0) {
                    nB += 1;
                }

                if ((itemA + itemB) % 12 == 0) {
                    nAandB += 1;
                }
            }
        }

        int result = nA + nB - nAandB;
        System.out.println("경우의 수 : " + result);

        // HashSet 사용
        Set<List<Integer>> set = new HashSet<>();
        for (int itemA : dice1) {
            for (int itemB : dice2) {
                if ((itemA + itemB) % 3 == 0 || (itemA + itemB) % 4 == 0) {
                    List<Integer> list = new ArrayList<>(Arrays.asList(itemA, itemB));
                    set.add(list);
                }
            }
        }
        System.out.println("set: " + set);
        System.out.println("set 경우의 수: " + set.size());
    }

    private static void multiplicationRule(int[] dice1, int[] dice2) {
        // 두 개의 주사위 a, b를 던졌을 때 a는 3의 배수, b는 4의 배수인 경우의 수
        System.out.println("===== 곱의 법칙 =====");

        int nA = 0;
        int nB = 0;

        for (int item : dice1) {
            if (item % 3 == 0) {
                nA += 1;
            }
        }

        for (int item : dice2) {
            if (item % 4 == 0) {
                nB += 1;
            }
        }

        System.out.println("경우의 수: " + nA * nB);
    }
}
