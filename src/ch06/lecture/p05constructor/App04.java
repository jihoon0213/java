package ch06.lecture.p05constructor;

public class App04 {
}

class MyClass42 {
    String name;
    String address;
    String email;
    int age;
    boolean married;

    public MyClass42(String name, String address, String email, int age, boolean married) {
        this.name = name;
        this.address = address;
        this.email = email;
        this.age = age;
        this.married = married;
    }
}

class MyClass41 {
    String name;
    String address;
    int age;
    boolean married;


    // constructor 단축키 : Alt + Insert
    public MyClass41(String name, String address, int age, boolean married) {
        this.name = name;
        this.address = address;
        this.age = age;
        this.married = married;
    }
}
