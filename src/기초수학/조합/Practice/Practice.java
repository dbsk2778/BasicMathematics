package 기초수학.조합.Practice;

import java.util.Arrays;

public class Practice {

    static int n = 4;
    static int r = 3;
    static int[] arr = {1, 2, 3, 4};
    // 조합에서 isUsed[] 배열은 불필요하다 !!
    // static boolean[] isUsed = new boolean[n];
    static int[] output = new int[r];
    static StringBuilder sb = new StringBuilder();

    // 1, 2, 3, 4를 이용하여 세 자리 자연수를 만드는 방법 (순서 X, 중복 X)의 각 결과를 출력하시오.
    // 순서가 상관 없으니까, 123, 132, 231 다 동일한 케이스다.
    public static void main(String[] args) {
        // 조합에서 중요한 것은, 이미 선택된 숫자보다 뒤에 있는 숫자들만 선택하는 것임
        // 배열을 정렬하는 것은 조합 결과를 오름차순으로 출력하기 위해 필요한 과정일 뿐, 필수적이지는 않습니다.
        // 조합 그 자체는 정렬과는 무관하게 작동합니다.
        Arrays.sort(arr);
        solution(0, 0);
        System.out.println(sb);
    }

    public static void solution(int depth, int start) {
        // base case
        if (depth == r) {
            for (int i = 0; i < r; i++) {
                sb.append(output[i]).append(" ");
            }
            sb.append("\n");
            return;
        }

        for (int i = start; i < n; i++) {
            //if (!isUsed[i]) {
            // isUsed[i] = true;
            output[depth] = arr[i];
            // start가 i + 1인 이유는 현재 사용한 값보다 더 큰 값만 사용하기 위해서임
            solution(depth + 1, i + 1);
            // isUsed[i] = false;
            // }
        }
    }
}
