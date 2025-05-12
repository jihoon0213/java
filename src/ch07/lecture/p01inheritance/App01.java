package ch07.lecture.p01inheritance;

public class App01 {
    public static void main(String[] args) {
        SubClass011 a = new SubClass011();
        a.age = 33;
        a.name = "aaa";
        System.out.println("a.age = " + a.age);
        a.action();
        a.gretting();
//        a.name;

        SubClass012 b = new SubClass012();
        b.age = 44;
        b.address = "aa";
        System.out.println("b.age = " + b.age);
        b.action();
//        b.greeting;
        b.go();

        MyClass01 c = new MyClass01();
        c.age = 55;
        System.out.println("c.age = " + c.age);
//        c.name;
//        c.address;
        c.action();

    }
}

class MyClass01 {
    // 부모 클래스(parent class)
    // 상위 클래스(super class)
    public int age;

    public void action() {
    }
}

//class MyClass02 {
//
//}

class SubClass011 extends MyClass01 {
    // 자식 클래스(child class)
    // 하위 클래스(sub class)
    // 하나의 자식 클래스가 여러 부모 클래스를 둘 수는 없음
    // 하나의 부모 클래스가 여러 자식 클래스를 둘 수는 있음

    // 멤버 추가
    // field
    public String name;

    public void gretting() {
    }
}

class SubClass012 extends MyClass01 {
    //자식 클래스에 추가할 멤버 작성 가능
    //field
    public String address;

    public void go() {

    }
}