package ch12.sec06;

public class BoxingUnBoxingExample {
    public static void main(String[] args) {
        Integer obj = 100;
        System.out.println("value: " + obj.intValue());

        int v = obj;
        System.out.println("v = " + v);

        int r = obj + 100;
        System.out.println("r = " + r);
    }
}
