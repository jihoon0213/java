package ch06.sec06.exam02;

public class CarExample {
    public static void main(String[] args) {
        Car c1 = new Car();

        System.out.println("c1.company = " + c1.company);
        System.out.println("c1.model = " + c1.model);
        System.out.println("c1.color = " + c1.color);
        System.out.println("c1.maxSpeed = " + c1.maxSpeed);
        System.out.println("c1.speed = " + c1.speed);

        c1.speed = 60;
        System.out.println("c1.speed = " + c1.speed);
        
    }
}
