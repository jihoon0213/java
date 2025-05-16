package ch12.practice;

import java.util.Scanner;
import java.util.regex.Pattern;

public class App03 {
    public static void main(String[] args) {
        //사용자 입력 받아서

        //유효한 전화번호인지 확인

        // 아래 전화번호들은 패턴에 일치하는 것들
        // 01099998888
        // 010-9999-8888
        // 010 9999 8888
        // 010-99998888
        // 010 99998888

        Scanner scanner = new Scanner(System.in);
        System.out.print("전화번호 : ");
        String user = scanner.nextLine();
        String reg = "010[- ]?(9{4}[- ]?8{4}|99998888)";

        if (Pattern.matches(reg, user)) {
            System.out.println("유효한 전화번호 입니다");
        } else {
            System.out.println("유효하지 않은 전화번호입니다");
        }


    }
}
