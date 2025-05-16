package ch12.practice;

import java.util.Scanner;
import java.util.regex.Pattern;

public class App02 {
    public static void main(String[] args) {
        // 사용자로 부터 입력받아서

        // 한글 3글자 이상인지 확인하는 코드 작성
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();

        if (Pattern.matches("[가-힣]{3,}", a)) {
            System.out.println("3글자 이상입니다.");
        } else {
            System.out.println("3글자 이상이 아닙니다");
        }

    }
}
