package ch08.lecture.p04api;

import java.io.Closeable;
import java.util.Iterator;
import java.util.Scanner;

public class App02 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Closeable a = s;
        Object b = s;
        AutoCloseable c = s;
        Iterator d = s;

        System.out.println(d instanceof Scanner);
        System.out.println(d instanceof Closeable);
        System.out.println(d instanceof Object);
        System.out.println(d instanceof AutoCloseable);
        System.out.println(d instanceof Iterator);


    }
}
