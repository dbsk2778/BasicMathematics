package 기초수학.집합;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Example {

    /*
        집합: 영어로 Set
        1. 특정 조건에 맞는 원소들의 모임
        2. 집합 표현 방법
            1) 원소 나열법  A = {1, 2, 3, 4, 5}, B = {2, 4, 6, 8, 10}
            2) 조건 제시법  A = {A|A는 정수, 1 <= A <= 5}, A = {2B|B는 정수, 1 <= B <= 5}
            3) 벤 다이어그램

        3. 집합의 종류
            1) 교집합 : 두 집합이 공통으로 포함하는 원소로 이루어진 집합
            2) 합집합 : 어느 하나에라도 속하는 원소들을 모두 모은 집합
            3) A(or B)에만 속하는 원소들의 집합 = A - B or B - A
            4) 여집합 : 전체 집합 중에서 A의 원소가 아닌 것들의 집합
     */

    // 자바에서 집합 사용은 HashSet 사용 !!
    public static void main(String[] args) {
        // 1. HashSet 사용 예제
        System.out.println("===== HashSet =====");

        Set<Integer> hashSet = new HashSet<>();
        hashSet.add(1);
        hashSet.add(2);
        hashSet.add(3);
        hashSet.remove(1); // 1의 값 삭제

        System.out.println(hashSet.size());
        System.out.println(hashSet.contains(2)); // 2의 값을 포함하고 있는지

        // 2. 집합 연산
        System.out.println("===== 집합 연산 =====");
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(2, 4, 6, 8, 10));

        // 2.1 교집합 : retainAll()은 set1과 set2의 교집합이 계산되어 set1에서는 교집합의 원소들만 남게됨
        set1.retainAll(set2);
        System.out.println("교집합: " + set1);

        // 2.2 합집합 : addAll()로 set1에 set2의 원소 다 넣음 (set이라 중복되는 값은 들어가지 않음)
        // set1.addAll(set2);
        // System.out.println(set1);

        // 2.3 차집합 : removeAll()로 set1에 포함되는 set2의 원소 없앰
        // set1.removeAll(set2);
        // System.out.println(set1);
    }
}
