package ch03.lecture;

public class C11Logical {
    public static void main(String[] args) {
        // 논리연산자
        // and &&, &
        // or ||, |

        // 피연산자는 boolean
        // 연산결과는 boolean

        // and &&, &
        // : 두 피연산자가 true일 때만 결과 true, 나머지 결과는 false

        System.out.println("(true && true) = " + (true && true));
        System.out.println("(true && false) = " + (true && false));
        System.out.println("(false && true) = " + (false && true));
        System.out.println("(false && false) = " + (false && false));

        System.out.println("(true & true) = " + (true & true));
        System.out.println("(true & false) = " + (true & false));
        System.out.println("(false & true) = " + (false & true));
        System.out.println("(false & false) = " + (false & false));

//        System.out.println("(0 && true) = " + (0 && true)); // x
//        System.out.println("(0 & tr) = " + (0 & true));
//        System.out.println("( 0 & 1) = " + (0 & 1));

        // or ||, |
        // 두 피연산자가 false면 결과가 false, 나머지 결과는 true
        System.out.println("(true ||true) = " + (true || true));
        System.out.println("(true ||fasle) = " + (true || false));
        System.out.println("(false ||true) = " + (false || true));
        System.out.println("(false ||false) = " + (false | false));

        System.out.println("(true ||true) = " + (true | true));
        System.out.println("(true ||fasle) = " + (true | false));
        System.out.println("(false ||true) = " + (false | true));
        System.out.println("(false ||false) = " + (false | false));

        // 연습
        int x = 5;
        int y = 8;
        boolean r1 = (x > 5) && (y < 5);
        System.out.println("r1 = " + r1); // false
        boolean r2 = (x > 5) || (y < 5);
        System.out.println("r2 = " + r2); // fasle
    }
}
