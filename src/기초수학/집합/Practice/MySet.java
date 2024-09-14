package 기초수학.집합.Practice;

import java.util.ArrayList;
import java.util.List;

// Set 컬렉션 사용하지 않고 직접 구현
public class MySet {
    List<Integer> list;

    // 생성자 1
    MySet() {
        this.list = new ArrayList<>();
    }

    // 생성자 2
    MySet(int[] arr) {
        this.list = new ArrayList<>();
        for (int item : arr) list.add(item);
    }

    // 원소 추가 (중복 X)
    public void add(int num) {
        for (int item : this.list) {
            // 중복된 값이 들어오면 바로 return 해주기
            if (item == num) {
                return;
            }
        }
        this.list.add(num);
    }

    // 교집합
    public MySet retainAll(MySet b) {
        MySet result = new MySet();

        for (int itemA : this.list) {
            for (int itemB : b.list) {
                // 공통 원소만 새로운 set에 추가해주기
                if (itemA == itemB) {
                    result.add(itemA);
                }
            }
        }

        return result;
    }

    // 합집합: 현재 add는 중복된 값 들어가지 않도록 구현되어 있으니 다른 조건 없이 그냥 add만 해주면 됨
    public MySet addAll(MySet b) {
        MySet result = new MySet();

        for (int itemA : this.list) {
            result.add(itemA);
        }

        for (int itemB : b.list) {
            result.add(itemB);
        }

        return result;
    }

    // 차집합
    public MySet removeAll(MySet b) {
        MySet result = new MySet();

        for (int itemA : this.list) {
            boolean containFlag = false;

            for (int itemB : b.list) {
                if (itemA == itemB) {
                    containFlag = true;
                    break;
                }
            }
            // A에 B가 포함되지 않았을 경우에만 add
            if (!containFlag) {
                result.add(itemA);
            }
        }

        return result;
    }
}
