package 기초수학.지수와로그.Example;

public class Example {
    /*
        학습 목표: 지수와 로그를 Math를 이용하여 계산

        1. 제곱
        - 같은 수를 두 번 곱함
        - 거듭 제곱: 같은 수를 거듭하여 곱함

        2. 제곱근 (=root)
        - a를 제곱하여 b가 될 때 a를 b의 제곱근이라고 함

        3. 지수
        - a^x (여기서 a를 밑, x를 지수라고 함)

        4. 로그
        - log 다음 아래 조그맣게 들어가는 수는 ()안에 넣어서 표현
        - log(a)B: a가 B가 되기 위해 제곱해야 하는 수
        ex. log(2)4 = 2 : 2가 4가 되기 위해 제곱해야 하는 수 = 2
        ex. log(10)1000 = 3 : 10이 1000이 되기 위해 제곱해야 하는 수 = 3

        ** Math 함수를 통한 지수와 로그의 구현
     */

    public static void main(String[] args) {
        System.out.println("제곱 : Math.pow(밑, 제곱)");

        System.out.println(Math.pow(2, 3));
        System.out.println(Math.pow(2, -3));  // 1/8이기 때문에 0.125
        System.out.println(Math.pow(-2, -3)); // -1/8이기 때문에 -0.125
        // 큰 숫자 출력 (int형으로 출력되지 않을 범위는 long형으로 형변환 해줘야 함)
        System.out.println((long) Math.pow(2, 30));
        // 또는 서식으로 출력 (%.0f 는 소수점이 나오지 않는 float 형태의 값)
        System.out.printf("%.0f\n", Math.pow(2, 30));

        System.out.println("제곱근 : Math.sqrt(수)");
        System.out.println(Math.sqrt(16));  // 4
        System.out.println(Math.pow(16, 0.5));  // (0.5 = 1.0 / 2)위와 같은 기능을 함 (sqrt 함수)
        System.out.println(Math.pow(16, 1.0 / 4));  // 2 (1.0 / 4 = 0.25)

        System.out.println("절대 값 : Math.abs(수)");
        System.out.println(Math.abs(-123));
        System.out.println(Math.abs(123));

        System.out.println("로그 : Math.log() = 밑이 자연로그(e, 약 2.718), Math.log10() = 밑이 10");
        System.out.println("자연 로그 e: " + Math.E);
        System.out.println(Math.log(Math.E));
        System.out.println(Math.log(10));
        System.out.println(Math.log10(1000));
        // 밑을 E, 10 이외의 값으로 사용하고 싶다면 아래와 같이 사용
        // log(2)4를 아래처럼 표현할 수 있음
        System.out.println(Math.log(4) / Math.log(2));
    }
}
