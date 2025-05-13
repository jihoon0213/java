package ch07.lecture.p06Super;

public class App01 {
}

class Parent01 {
    public void action1() {
    }

    public void action2() {
    }

    public void action3() {
        System.out.println("부모의 액션3");
    }
}

class Child011 extends Parent01 {
    @Override
    public void action3() {
        System.out.println("추가된 코드");
        super.action3();
        System.out.println("추가된 코드");
    }

    @Override
    public void action2() {
        System.out.println("재정의된 액션2");
    }

    public void method1() {
        this.method2();
        method2();

        this.action1();
        action1();

        // 재정의한 메소드
        this.action2();
        action2();

        //부모의 메소드
        super.action2();
    }

    public void method2() {
    }
}
