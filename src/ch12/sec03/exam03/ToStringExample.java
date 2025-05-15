package ch12.sec03.exam03;

public class ToStringExample {
    public static void main(String[] args) {
        SmartPhone s = new SmartPhone("삼성", "안드로이드");

        String st = s.toString();
        System.out.println(st);

        System.out.println(s.toString());
        System.out.println(s);
    }
}
