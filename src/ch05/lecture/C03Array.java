package ch05.lecture;

public class C03Array {
    public static void main(String[] args) {
        int[] a = new int[3];


        double[] b = new double[3];
        for (int i = 0; i < 3; i++) {
            System.out.println(b[i]);
        }

        boolean[] c = new boolean[3];
        for (int i = 0; i < 3; i++) {
            System.out.println(c[i]);
        }


        String[] d = new String[3];
        d[0] = "hi";
        d[1] = "hi1";
        d[2] = "hi2";
        for (int i = 0; i < 3; i++) {
            System.out.println(d[i]);
        }
    }
}
