package ch12.lecture.p03math;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class App05 {
    public static void main(String[] args) {
        System.out.println("1~10 사이의 수 3개 맞추기 게임");
        Scanner scanner = new Scanner(System.in);

        System.out.println("3개의 숫자를 ,로 구분해서 입력해 주세요");
        System.out.print("입력 -> ");
        String line = scanner.nextLine();
        String[] number = line.split(",");
        int[] num = {
                Integer.parseInt(number[0]),
                Integer.parseInt(number[1]),
                Integer.parseInt(number[2])
        };

        int count = 0;
        int[] coms = new int[3];
        Random random = new Random();
        while (count < 3) {
            int r = random.nextInt(10) + 1;
            boolean alreadyHave = false;
            for (int i = 0; i < coms.length; i++) {
                if (r == coms[i]) {
                    alreadyHave = true;
                }
            }

            if (!alreadyHave) {
                coms[count] = r;
                count++;
            }
        }

        System.out.println("사용자: " + Arrays.toString(num));
        System.out.println("컴퓨터: " + Arrays.toString(coms));


        int right = 0;
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < coms.length; j++) {
                if (num[i] == coms[j]) {
                    right++;
                }
            }
        }

        switch (right) {
            case 3 -> {
                System.out.println("1등 3개 맞췄습니다");
            }
            case 2 -> {
                System.out.println("2등 2개 맞췄습니다");
            }
            case 1 -> {
                System.out.println("3등 1개 맞췄습니다");
            }
            case 0 -> {
                System.out.println("꽝 못 맞췄습니다");
            }
        }
        System.out.println("종료");
    }
}
