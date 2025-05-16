package ch12.lecture.p04regex;

import java.util.regex.Pattern;

public class App02 {
    public static void main(String[] args) {
        System.out.println(Pattern.matches("a", "a"));
        System.out.println(Pattern.matches("a", "b"));
        System.out.println();

        // [] : character class
        System.out.println(Pattern.matches("[ab]", "a"));
        System.out.println(Pattern.matches("[ab]", "b"));
        System.out.println(Pattern.matches("[ab]", "ab"));
        System.out.println(Pattern.matches("[ab][ab]", "ab"));
        System.out.println(Pattern.matches("[ab][ab]", "aa"));
        System.out.println(Pattern.matches("[ab][ab]", "bb"));
        System.out.println(Pattern.matches("[ab][ab]", "ba"));
        System.out.println();

        // [] 안의 - : 범위
        System.out.println(Pattern.matches("[a-e]", "a"));
        System.out.println(Pattern.matches("[a-e]", "b"));
        System.out.println(Pattern.matches("[a-e]", "c"));
        System.out.println(Pattern.matches("[a-e]", "d"));
        System.out.println(Pattern.matches("[a-e]", "e"));
        System.out.println(Pattern.matches("[a-z]", "o")); // 소문자 한글자
        System.out.println(Pattern.matches("[A-Z]", "G")); // 대문자 한글자
        System.out.println(Pattern.matches("[A-Z]", "g")); // 대문자 한글자
        System.out.println(Pattern.matches("[0-9]", "3")); // 숫자
        System.out.println();
        System.out.println(Pattern.matches("[0-9A-Za-z]", "7")); // 대소문자, 숫자
        System.out.println(Pattern.matches("[0-9A-Za-z]", "t")); // 대소문자, 숫자
        System.out.println(Pattern.matches("[0-9A-Za-z]", "V")); // 대소문자, 숫자
        System.out.println(Pattern.matches("[가-힣]", "손")); // 한글
        System.out.println(Pattern.matches("[가-힣]", "발")); // 한글
        System.out.println(Pattern.matches("[가-힣0-9A-Za-z]", "발")); // 한글, 영대소문자, 숫자
    }
}
