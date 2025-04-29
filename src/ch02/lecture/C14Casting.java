package ch02.lecture;

public class C14Casting {
    public static void main(String[] args) {
        // 타입 변환
        // 작은 타입의 변수값을 큰 타입에 옮겨 담는 것은 항상 가능(문제 없음)

        byte a = 3; //1byte
        short b = 100; //2byte
        int c = 200; //4byte
        long d = 300L; //8byte

        b = a;
        c = a;
        d = a;

        d = b;

        d = c;

        byte e = 3;
        short f = 4;
        int g = 9;
        long h = 10L;

        float i;
        double j;
        i = e;
        i = f;
        i = g;
        i = h;

        i = e;
        i = f;
        i = g;
        i = h;

        float k = 3.14F;
        double l = 3.14;

        l = k;

        //char는 int와 long에 옮기기 가능
        char m = '가';
        int n = m;
    }
}
