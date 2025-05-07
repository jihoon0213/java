package ch05.lecture;

public class C22String {
    public static void main(String[] args) {
        // 9번째 기본타입
        String a = "java";

        String b = new String("java");
        String c = new String("react");

        System.out.println(b == c);

        String d = new String("java");
        String e = new String("java");

        // 결론 : 문자열의 내용이 같은 지 확인 할 때
        // == 쓰지 말것!!! -> equals() 메소드 사용!!

        System.out.println(d == e);

    }
}
