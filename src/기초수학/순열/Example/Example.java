package 기초수학.순열.Example;

public class Example {
    /*
        1. 팩토리얼(Factorial)
            - 1에서 n까지의 모든 자연수의 곱
            = (n!) = n * (n-1) * (n-2) ... 1

        2. 순열(Permutation)
            - 순서를 정해서 나열
            - 서로 다른 n개 중에 r개를 선택하는 경우의 수(순서O, 중복X)
            - ex. 5명을 3줄로 세우는 방법
            - ex. 서로 다른 4명 중 반장, 부반장 뽑는 방법
            = nPr = n! / (n-r)! = n(n-1)(n-2)...(n-r+1) (단, 0 < r <= n)

        3. 중복 순열
            - 서로 다른 n개 중에 r개를 선택하는 경우의 수 (순서 O, 중복 O)
            - ex. 서로 다른 4개의 수 중 2개를 뽑는 방법 (중복 허용) -> 뽑은 수를 또 뽑을 수 있는 경우
            - ex. 후보 2명, 유권자 3명일 때 기명 투표 방법
            = n의 r승

        4. 원순열
            - 원 모양의 테이블에 n개의 원소를 나열하는 경우의 수
            - ex. 원 모양의 테이블에 3명을 앉히는 경우
            = n! / n = (n-1)!
     */
}