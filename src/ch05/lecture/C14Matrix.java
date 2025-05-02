package ch05.lecture;

public class C14Matrix {
    public static void main(String[] args) {
        int[][] a = new int[3][];
        a[0] = new int[4];
        a[1] = new int[4];
        a[2] = new int[4];


        int[][] b = new int[3][4];
        b[0][0] = 99;
        b[0][1] = 88;
        b[0][2] = 77;
        b[0][3] = 66;


        b[1][1] = 123;
        b[1][1] = 14;
        b[1][2] = 345;
        b[1][3] = 12;

        b[2][1] = 57;
        b[2][1] = 56;
        b[2][2] = 78;
        b[2][3] = 65;

        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                System.out.println(a[i][j]);
            }
        }
        System.out.println();


        //각 행 마다 다른 수의 열로 생성
        int[][] c = new int[3][];
        c[0] = new int[4];
        c[1] = new int[3];
        c[2] = new int[5];

        c[0][0] = 9;
        c[0][1] = 8;
        c[0][2] = 7;
        c[0][3] = 6;

        c[1][0] = 5;
        c[1][1] = 4;
        c[1][2] = 3;

        c[2][0] = 2;
        c[2][1] = 1;
        c[2][2] = 0;
        c[2][3] = -1;
        c[2][4] = -2;

        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c[i].length; j++) {
                System.out.println("c[" + i + "][" + j + "] = " + c[i][j]);
            }
            System.out.println();
        }

        int[][] d = new int[3][];
        d[0] = new int[]{9, 8, 7, 6};
        d[1] = new int[]{5, 4, 3};
        d[2] = new int[]{2, 1, 0, -1, -2};

        for (int i = 0; i < d.length; i++) {
            for (int j = 0; j < d[i].length; j++) {
                System.out.println("d[" + i + "][" + j + "] = " + d[i][j]);
            }
        }
    }
}
