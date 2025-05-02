package ch05.Exercise;

public class exercise08 {
    public static void main(String[] args) {
        int[][] a = {{95, 86},
                {83, 92, 96},
                {78, 83, 93, 87, 88}
        };

        int num = 0;
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            num += a[i].length;
            for (int j = 0; j < a[i].length; j++) {
                sum += a[i][j];
            }
        }

        System.out.println("sum = " + sum);

        double avg = (double) sum / num;
        System.out.println("avg = " + avg);
    }
}
