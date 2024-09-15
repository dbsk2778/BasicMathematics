package 기초수학.재귀.Practice;

public class Practice2 {
    // 최대공약수를 팩토리얼로 구현하기
    public static void main(String[] args) {
        System.out.println(getGCD(11, 22));
        System.out.println(getGCD2(11, 22));
    }

    /*
        유클리드 호제법 사용 - 두 수의 나머지를 재귀적으로 계산하여 GCD를 구하는 알고리즘
        시간 복잡도는 log(min(a, b)), 메모리도 거의 사용하지 않음

        원리
        두 수 a와 b의 최대 공약수는, b와 a % b의 최대 공약수와 같음
        이 과정은 나머지가 0이 될 때까지 반복되며, 나머지가 0이 되었을 때의 b 값이 두 수의 최대 공약수

        아래 두 함수의 종료 조건의 차이일 뿐 성능 차이는 없음, 동일한 기능을 함
    */

    // numB == 0일 때 numA를 반환하는 방식
    public static int getGCD(int numA, int numB) {
        // numA % numB의 나머지가 0이 될때까지 반복
        // numB가 0이 되었을 때의 numA 값이 최대 공약수
        if (numB == 0) {
            return numA;
        }
        // numA, numB의 최대 공약수는 numB와 numA % numB 나머지의 최대 공약수와 같다.
        return getGCD(numB, numA % numB);
    }

    // numA % numB == 0일 때 numB를 반환하는 방식
    public static int getGCD2(int numA, int numB) {
        if (numA % numB == 0) {
            return numB;
        }
        return getGCD2(numB, numA % numB);
    }
}
