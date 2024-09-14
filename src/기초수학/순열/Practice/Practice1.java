package 기초수학.순열.Practice;

public class Practice1 {

    static int count = 0;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        // 1, 2, 3, 4를 사용해서 세자리 자연수를 만드는 방법 (순서 O, 중복 X)
        permutation(arr, 0, 4, 3);
        System.out.println(sb);
        System.out.println(count);
    }

    // 하나의 배열 요소를 기반으로 자리를 바꿔가며 r개의 요소를 선택하는 순열 구현
    // 요소를 교환(swap())하는 방식으로 순열을 구하기, 각 재귀 호출마다 현재 선택된 자리와 다음 자리를 교환한 후, 다시 원래 상태로 복구하는 방식으로 작동
    // depth는 각 자리 수
    public static void permutation(int[] arr, int depth, int n, int r) {
        // 탈출 조건
        if (depth == r) {
            count++;
            // r개를 모두 선택했을 때 배열을 출력 (순열의 결과)
            for (int i = 0; i < r; i++) {
                sb.append(arr[i]).append(" ");
            }
            sb.append("\n");
            return;
        }

        // 재귀함수
        for (int i = depth; i < n; i++) {
            // 배열의 요소들 사이에서 자리를 바꾸면서 가능한 모든 순열을 구함
            swap(arr, depth, i);
            permutation(arr, depth + 1, n, r);  // 재귀적으로 다음 순열을 구함
            swap(arr, depth, i);  // 원래 상태로 복구 (백트래킹)
        }
    }

    // 자리 변겅
    public static void swap(int[] arr, int depth, int idx) {
        int temp = arr[depth];
        arr[depth] = arr[idx];
        arr[idx] = temp;
    }
}
