package 기초수학.순열.Practice;

public class Practice2 {

    static int[] arr;
    static int n, r;
    static boolean[] isUsed;
    static int[] output;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {
        n = 4;
        r = 3;
        arr = new int[]{1, 2, 3, 4};
        isUsed = new boolean[n];
        output = new int[r];

        permutation(0);

        System.out.println(sb);
    }

    // isUsed[] 배열을 사용하여, 각 요소가 이미 사용되었는지 추적
    // 이미 사용된 요소는 선택하지 않도록 하여 중복 없이 순열을 생성
    public static void permutation(int depth) {
        // base case
        if (depth == r) {
            for (int i = 0; i < r; i++) {
                sb.append(output[i]).append(" ");
            }
            sb.append("\n");
            return;
        }

        // permutation case
        for (int i = 0; i < n; i++) {
            if (!isUsed[i]) {
                isUsed[i] = true;
                output[depth] = arr[i];
                permutation(depth + 1);
                isUsed[i] = false;
            }
        }
    }
}
