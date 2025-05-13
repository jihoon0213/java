package ch08.lecture.p02method;

public class App02 {
}

interface MyInterface02 {
    // interface 의 모든 메소드는 public abstract 메소드
    public abstract void action1();

    // public abstract 생략
    void action2();

    public void action3();

    abstract void action4();
}

class MyClass021 implements MyInterface02 {
    @Override
    public void action1() {

    }

    @Override
    public void action2() {

    }

    @Override
    public void action3() {

    }

    @Override
    public void action4() {

    }
}
