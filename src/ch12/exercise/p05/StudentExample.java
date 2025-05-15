package ch12.exercise.p05;

import java.util.HashSet;

public class StudentExample {
    public static void main(String[] args) {

        HashSet hashSet = new HashSet();

        Student s1 = new Student("1");
        hashSet.add(s1);

        Student s2 = new Student("1");
        hashSet.add(s2);

        Student s3 = new Student("2");
        hashSet.add(s3);

        System.out.println(hashSet.size());

    }
}
