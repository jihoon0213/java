package ch05.Exercise;

public class exercise07 {
    public static void main(String[] args) {
        int[] array = {1, 5, 3, 8, 2};
        int m = array[0];

        for (int a : array) {
            if (a > m) {
                m = a;
            }
        }

        System.out.println("m = " + m);

        for (int i = 0; i < array.length; i++) {
            if (array[i] > m) {
                m = array[i];
            }
        }

        System.out.println("m = " + m);
    }
}
