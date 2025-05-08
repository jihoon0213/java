package ch06.sec08.exam01;

public class CalculatorExample {
    public static void main(String[] args) {
        Calculator c1 = new Calculator();

        c1.powerOn();

        int r1 = c1.plus(5, 6);
        System.out.println("r1 = " + r1);

        int x = 10;
        int y = 4;

        double r2 = c1.divide(x, y);
        System.out.println("r2 = " + r2);

        c1.powerOff();

    }
}
