package ch07.lecture.p04cast;

public class App05 {
    public static void main(String[] args) {
        // 확인하고 강제형변환(type casting)

        // instanceof 연산자 : 형변환 가능한 type인지 확인
        // 왼쪽항(참조변수), 오른쪽항(타입)
        // 결과 boolean

        Parent05 a = new Child051();
        System.out.println((a instanceof Child051));
        System.out.println(a instanceof Parent05);
        System.out.println(a instanceof Child052);

        Child051 b = (Child051) a;
        Child052 c = (Child052) a;
        
        System.out.println("프로그램종료");
    }
}

class Parent05 {

}

class Child051 extends Parent05 {

}

class Child052 extends Parent05 {

}
