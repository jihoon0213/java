package ch13.sec03.exam01;

public class GenericExample {

    public static <T> Box<T> boxing(T t) {
        Box<T> box = new Box<T>();
        box.set(t);
        return box;
    }

    public static void main(String[] args) {

        Box<Integer> box1 = boxing(100);
        int a = box1.get();
        System.out.println("a = " + a);

        Box<String> box2 = boxing("홍길동");
        String b = box2.get();
        System.out.println("b = " + b);
    }
}


