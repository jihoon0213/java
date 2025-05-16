package ch12.lecture.p04regex;

import java.util.regex.Pattern;

public class App06 {
    public static void main(String[] args) {
        // {n,m} : n~m개
        // {n,} : n개 이상
        // {n} : n개

        // + : {1,} : 한개 이상
        // * : {0," : 0개 이상
        // ? : {0,1} : 0~1 개

        System.out.println(Pattern.matches("[0-9]+", "2"));
        System.out.println(Pattern.matches("[0-9]+", "2325"));
        System.out.println(Pattern.matches("[0-9]+", ""));

        System.out.println(Pattern.matches("[0-9]*", "2"));
        System.out.println(Pattern.matches("[0-9]*", "2325"));
        System.out.println(Pattern.matches("[0-9]*", ""));

        System.out.println(Pattern.matches("[0-9]?", "2"));
        System.out.println(Pattern.matches("[0-9]?", "2325"));
        System.out.println(Pattern.matches("[0-9]?", ""));


    }
}
