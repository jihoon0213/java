package ch06.sec08.exam01;

public class Calculator {
    void powerOn() {
        System.out.println("전원을 켭니다.");
    }

    void powerOff() {
        System.out.println("전원을 끕니다.");
    }

    int plus(int x, int y) {
        int r1 = x + y;
        return r1;
    }

    double divide(int x, int y) {
        double r2 = (double) x / (double) y;
        return r2;
    }
}
