package ch07.sec05.exam02;

public class SportsCar extends Car {

    @Override
    public void speedUp() {
        super.speedUp();
        speed += 10;
    }

//    @Override
//    public void stop() {
//        System.out.println("스포츠카 멈춤");
//        speed = 0;
//
//    }
}
