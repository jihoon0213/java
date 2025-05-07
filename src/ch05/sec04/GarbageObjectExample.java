package ch05.sec04;

public class GarbageObjectExample {
    public static void main(String[] args) {
        String h = "여행";
        h = null;

        String k1 = "자동차";
        String k2 = k1;
        k1 = null;
        System.out.println("k2 = " + k2);
    }
}
