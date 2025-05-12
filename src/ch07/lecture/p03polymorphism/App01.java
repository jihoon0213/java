package ch07.lecture.p03polymorphism;

public class App01 {
    public static void main(String[] args) {
        // 자동형변환

        SuperClass01 a = new SuperClass01();
        SubClass011 b = new SubClass011();
        SuperClass01 c = a;
        SubClass011 d = b;
        SuperClass01 e = b;
//        SubClass011 f = a;
    }
}

// @formatter:off
class SuperClass01 { }

class SubClass011 extends SuperClass01 { }

class SubClass012 extends SuperClass01 { }

