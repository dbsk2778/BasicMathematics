package 기초수학.조합.Example;

public class Example {
    /*
        1. 조합(Combination): 서로 다른 n개 중 r개를 선택하는 경우의 수(순서 X, 중복 X)
           ex. 서로 다른 4명 중 주번 2명을 뽑는 방법 (순열은 반장, 부반장 뽑기)
           = nCr = nPr / r! = n! / (n-r)! * r! (단, 0 < r <= n) (순서가 없다보니, nPr 보다 경우의 수 당연히 작음)
           = nPr = n! / (n-r)! = n(n-1)(n-2)...(n-r+1) (단, 0 < r <= n)


        2. 중복 조합: 서로 다른 n개 중에서 r개를 선택하는 경우의 수 (순서 X, 중복 O)
           ex. 후보 2명, 유권자 3명일 때 무기명 투표 방법
           - 기명 투표인 중복 순열보다 더 작은 경우의 수 나옴, 중복 순열은 1 A, 2 B, 3 A의 경우와 1 B, 2 A, 3 A가 다른데, 중복 조합은 A B A / B A A 는 동일 취급
           = nHr = n+r-1Cr = (n-r-1)! / (n-2r-1)! * r!
     */
}
