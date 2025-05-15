package ch12.sec03.exam01;

public class EqualsExample {
    public static void main(String[] args) {
        Member o1 = new Member("blue");
        Member o2 = new Member("blue");
        Member o3 = new Member("red");

        if (o1.equals(o2)) {
            System.out.println("o1과 o2o는 동등");
        } else {
            System.out.println("동등하지 않음");
        }

        if (o1.equals(o3)) {
            System.out.println("o1과 o1은 동등");
        } else {
            System.out.println("동등하지 않음");
        }
    }
}
