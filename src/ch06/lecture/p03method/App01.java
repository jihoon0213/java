package ch06.lecture.p03method;

public class App01 {
    public static void main(String[] args) {
        MyClass01 a = new MyClass01();
        a.age = 30;
        a.work(); // method실행
        a.go();
        a.action();
    }
}

// 설계도
class MyClass01 {
    // field
    int age;

    // method : 객체가 가진 기능
    // (비교하자면 javascript의 함수와 유사)

    void work() {
        // 리턴타입 메소드명(파라미터 목록) { 몸체}
        // 메소드명 작성관습 : lowerCamelCase
        // 주로 동사(verb)로 시작
        System.out.println("작동합니다.");

    }

    void go() {
        // 1~4
        // 변수, 타입, 연산자, 제어문 등을 활용한 실행 코드
        System.out.println("가는중입니다.");

    }

    void action() {
        System.out.println("실행중입니다.");

    }
}