package ch12.practice;

import java.util.Random;
import java.util.Scanner;

public class App01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random r = new Random();

        // 사용자 입력 받기
        System.out.print("안내면 진 거 가위 바위 보!");
        String user = scanner.nextLine();

        // 컴퓨터의 선택: 0 - 가위, 1 - 바위, 2 - 보
        int comNum = r.nextInt(3);
        String[] choices = {"가위", "바위", "보"};
        String computer = choices[comNum];

        System.out.println("컴퓨터: " + computer);

        // 결과 판단
        if (user.equals(computer)) {
            System.out.println("비겼습니다!");
        } else if (
                (user.equals("가위") && computer.equals("보")) ||
                        (user.equals("바위") && computer.equals("가위")) ||
                        (user.equals("보") && computer.equals("바위"))
        ) {
            System.out.println("이겼습니다!");
        } else if (
                (user.equals("가위") || user.equals("바위") || user.equals("보"))
        ) {
            System.out.println("졌습니다!");
        } else {
            System.out.println("잘못된 입력입니다. 가위, 바위, 보 중에 입력해주세요.");
        }

        scanner.close();
    }
}
