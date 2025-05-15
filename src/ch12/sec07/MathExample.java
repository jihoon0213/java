package ch12.sec07;

public class MathExample {
    public static void main(String[] args) {
        double v1 = Math.ceil(5.3);
        double v2 = Math.floor(5.3);
        System.out.println("v1 = " + v1);
        System.out.println("v2 = " + v2);

        long v3 = Math.max(3, 7);
        long v4 = Math.min(3, 7);
        System.out.println("v3 = " + v3);
        System.out.println("v4 = " + v4);

        double v = 12.3456;
        double t1 = v * 100;
        System.out.println("t1 = " + t1);
        long t2 = Math.round(t1);
        System.out.println("t2 = " + t2);
        double v5 = t2 / 100.0;
        System.out.println("v5 = " + v5);
    }
}
