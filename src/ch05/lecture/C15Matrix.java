package ch05.lecture;

public class C15Matrix {
    public static void main(String[] args) {
        int[] a;
        a = new int[]{3, 4, 5};

        int[] c = {3, 4, 5};


        int[][] b;
        b = new int[][]{{99, 88, 77}, {4, 5}, {101, 102, 103, 104}};

        int[][] d = {{99, 88, 77},
                {4, 5},
                {101, 102, 103, 104}
        };

        for (int i = 0; i < d.length; i++) {
            for (int j = 0; j < d[i].length; j++) {
                System.out.println("d[" + i + "][" + j + "]:" + d[i][j]);
            }
        }
    }
}
