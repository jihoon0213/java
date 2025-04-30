package ch04.lecture;

public class C14DoWhile {
    public static void main(String[] args) {
        // while : ()조건 확인 후 {} 실핼 -> () 조건확인

        // do while : {} 실행 후 ()확인 - true -> {}실행


        System.out.println("code1");

        boolean a = false;
        do {
            System.out.println("code2");
            System.out.println("code3");
        } while (a);
        System.out.println("code4");
        System.out.println("code5");
    }
}
