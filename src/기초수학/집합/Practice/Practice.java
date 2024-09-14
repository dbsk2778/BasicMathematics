package 기초수학.집합.Practice;

public class Practice {
    public static void main(String[] args) {
        MySet set = new MySet();
        set.add(1);
        set.add(1);
        System.out.println("mySet: " + set.list);

        set.add(2);
        set.add(3);
        System.out.println("mySet: " + set.list);

        MySet a = new MySet(new int[]{1, 2, 3, 4, 5});
        MySet b = new MySet(new int[]{2, 4, 6, 8, 10});

        System.out.println("a: " + a.list);
        System.out.println("b: " + b.list);

        MySet result = a.retainAll(b);
        System.out.println("교집합: " + result.list);

        result = a.addAll(b);
        System.out.println("합집합: " + result.list);

        result = a.removeAll(b);
        System.out.println("차집합: " + result.list);
    }
}