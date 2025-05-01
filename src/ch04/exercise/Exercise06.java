package ch04.exercise;

public class Exercise06 {
    public static void main(String[] args) {
        for (int i = 0; i <= 4; i++) {
            for (int j = 0; j < (i + 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("------------------------");
        String s = "*";
        for (int i = 0; i < 5; i++, s += "*") {
            System.out.println(s);

        }

        System.out.println("---------------------");

        String s1 = "*****";
        for (int i = 5; i > 0; i--) {
            System.out.println(s1.substring(0, i));
        }

    }
}
