package ch12.lecture.p05wrapper;

public class App01 {
    public static void main(String[] args) {
        // byte, short, int long
        // float, double
        // boolean
        // char

        // 참조타입 8개(Wrapper Class) (13장,15장 사용됨)
        // Byte, Short, Integer, Long
        //Float,Double
        // Boolean
        // Character


        int a = 3;

        // 참조타입 Integer로 기본타입 int를 감싼 객체
        Integer b = Integer.valueOf(a); //boxing
//        Integer c = new Integer(a); // 예전버전

        Integer d = 99999;

        // 참조타입Integer를 기본타입 int로 전환


        int e = d.intValue();
    }
}
