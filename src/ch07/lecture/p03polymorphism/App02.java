package ch07.lecture.p03polymorphism;

public class App02 {
    public static void main(String[] args) {
        SuperClass02 a = new SuperClass02();
        SubClass021 b = new SubClass021();
        SubClass022 c = new SubClass022();
        SubClass023 d = new SubClass023();
        SubClass024 e = new SubClass024();

//        SubClass024 f = a;
//        SubClass023 g = c;
    }
}

// @formatter:off
class SuperClass02{
}
class SubClass021 extends SuperClass02{
}

class SubClass022 extends SuperClass02{
}

class SubClass023 extends SubClass021{
}
class SubClass024 extends SubClass022{
}
// @formatter:on
