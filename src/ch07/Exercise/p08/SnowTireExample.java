package ch07.Exercise.p08;

public class SnowTireExample {
    public static void main(String[] args) {
        SnowTire snowTire = new SnowTire();
        Tire tire = snowTire;

        tire.run();
        snowTire.run();
        
    }
}
