package ch04.practice;

public class ColoredHeart {
    // ANSI 색상 코드
    public static final String RED = "\u001B[31m";
    public static final String RESET = "\u001B[0m";

    public static void main(String[] args) {
        int n = 6;

        for (int i = n / 2; i <= n; i += 2) {
            for (int j = 1; j < n - i; j += 2)
                System.out.print(" ");

            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i) System.out.print(RED + "*" + RESET);
                else System.out.print(" ");
            }

            for (int j = 1; j <= n - i; j++)
                System.out.print(" ");

            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i) System.out.print(RED + "*" + RESET);
                else System.out.print(" ");
            }

            System.out.println();
        }

        for (int i = n; i >= 1; i--) {
            for (int j = 0; j < n - i; j++)
                System.out.print(" ");

            for (int j = 1; j <= (i * 2) - 1; j++) {
                if (j == 1 || j == (i * 2) - 1) System.out.print(RED + "*" + RESET);
                else System.out.print(" ");
            }

            System.out.println();
        }
    }
}

