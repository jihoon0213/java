package ch12.lecture.p03math;

import java.util.Random;
import java.util.Scanner;

public class App04 {
    public static void main(String[] args) {
        // 컴퓨터와 가위바위보 게임
        Scanner scanner = new Scanner(System.in);


        System.out.println("가위바위보 게임 시작");

        while (true) {
            System.out.println("1.가위 2.바위 3.보 4.종료");
            System.out.print(" 입력 > ");

            String user = scanner.nextLine();
            int u = Integer.parseInt(user);

            if (u == 4) {
                break;
            }
            Random random = new Random();

            int com = random.nextInt(3) + 1;
            switch (com) {
                case 1 -> {
                    System.out.println("컴퓨터 : 가위");
                }
                case 2 -> {
                    System.out.println("컴퓨터 : 바위");
                }
                case 3 -> {
                    System.out.println("컴퓨터 : 보");
                }
            }
            if (u == com) {
                // 비김
                System.out.println("비김");
            } else if (u == 1 && com == 3) {
                // 이김
                System.out.println("이김");
            } else if (u == 2 && com == 1) {
                // 이김
                System.out.println("이김");
            } else if (u == 3 && com == 2) {
                // 이김
                System.out.println("이김");
            } else {
                System.out.println("짐");
            }
        }

        System.out.println("종료");
    }
}
