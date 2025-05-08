package ch06.lecture.p05constructor;

public class App07 {
    public static void main(String[] args) {

    }
}

class MyClass07 {
    String name;
    int age;
    String email;
    boolean married;

    public MyClass07() {
        this.name = "홍길동";
        this.age = 1;
        this.email = "없음";
        this.married = false;

    }

    public MyClass07(String name) {
        this.name = name;
    }

    public MyClass07(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public MyClass07(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }

    public MyClass07(String name, int age, String email, boolean married) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.married = married;
    }
}
