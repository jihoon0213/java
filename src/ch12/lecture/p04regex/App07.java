package ch12.lecture.p04regex;

import java.util.regex.Pattern;

public class App07 {
    public static void main(String[] args) {
        // [a-zA-Z0-9] : \w
        // [0-9] : \d
        // [ ] : \s (공백)
        // \ : \\

        // . : 모든 글자

        System.out.println(Pattern.matches("\\w+", "a9dfasdf_asdfASF"));
        System.out.println(Pattern.matches("\\d+", "98751351"));
        System.out.println(Pattern.matches("\\s+", "                "));
        System.out.println(Pattern.matches("\\\\", "\\"));
        System.out.println();

        System.out.println(Pattern.matches(".*", ""));
        System.out.println(Pattern.matches(".*", "ao8"));
        System.out.println(Pattern.matches(".*", "한글"));
        System.out.println();

        System.out.println(Pattern.matches("\\.", "."));
        System.out.println(Pattern.matches("\\.", "a"));
    }
}
