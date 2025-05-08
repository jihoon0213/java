package ch06.exercise.p13;

public class App01 {
    public static void main(String[] args) {
        Member m = new Member();

        System.out.println("m.name = " + m.name);
        System.out.println("m.id = " + m.id);
        System.out.println("m.pw = " + m.pw);
        System.out.println("m.age = " + m.age);

        Member user1 = new Member();
        user1.name = "홍길동";
        user1.id = "hong";

        System.out.println("user1.name = " + user1.name);
        System.out.println("user1.id = " + user1.id);
        
    }
}
