package ch04.exercise;

import java.util.Scanner;

public class Exercise07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean run = true;
        int balance = 0;


        while (run) {
            System.out.println("--------------------------------");
            System.out.println("1.예금 | 2.출금 | 3.잔고 | 4,종료");
            System.out.println("--------------------------------");
            System.out.print("선택 > ");


            String select = scanner.nextLine();
            if (select.equals("1")) {
                System.out.print("예금액 > ");
                int money = Integer.parseInt(scanner.nextLine());
                balance += money;
            } else if (select.equals("2")) {
                System.out.print("출금액 > ");
                int money = Integer.parseInt(scanner.nextLine());
                balance -= money;
            } else if (select.equals("3")) {
                System.out.println("잔고 > " + balance);
            } else if (select.equals("4")) {
                run = false;
            }
        }

        System.out.println("프로그램 종료");
    }
}
