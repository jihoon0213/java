package ch07.lecture.p03polymorphism;

public class App03 {
    public static void main(String[] args) {
        Dog01 a = new Dog01();
        BullDog01 b = new BullDog01();
        Chihuahua01 c = new Chihuahua01();

        a.bark();
        b.bark();
        c.bark();

        Dog01 d = b;
        d.bark();
        Dog01 e = c;
        e.bark();
        // 실제 인스턴스의 메소드 실행
    }
}

class Dog01 {
    public void bark() {
        System.out.println("멍멍");

    }
}

class BullDog01 extends Dog01 {
    @Override
    public void bark() {
        System.out.println("으르렁");
    }
}

class Chihuahua01 extends Dog01 {
    @Override
    public void bark() {
        System.out.println("깨갱");

    }
}