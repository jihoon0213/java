package ch05.sec07;

public class MultidimensionalArrayByValueListExample {
    public static void main(String[] args) {
        int[][] scores = {{80, 90, 96},
                {76, 88}
        };


        System.out.println("1차원 배열 길이(반의 수): " + scores.length);
        System.out.println("2차원 배열 길이(첫 번째 반의 학생 수): " + scores[0].length);
        System.out.println("1차원 배열 길이(두 번째 반의 학생 수): " + scores[1].length);

        System.out.println("첫 번째 반의 세 번째 학생의 점수: " + scores[0][2]);

        System.out.println("두 번째 반의 두 번째 학생의 점수: " + scores[1][1]);

        int class1Sum = 0;
        for (int i = 0; i < scores[0].length; i++) {
            class1Sum += scores[0][i];
        }
        System.out.println("1반 점수의 총합:" + class1Sum);

        double class1Avg = (double) class1Sum / scores[0].length;
        System.out.println("첫 번째 반의 평균 점수: " + class1Avg);

        int class2Sum = 0;
        for (int i = 0; i < scores[1].length; i++) {
            class2Sum += scores[1][i];
        }
        System.out.println("2반 점수의 총합:" + class2Sum);
        double class2Avg = (double) class2Sum / scores[1].length;
        System.out.println("두 번째 반의 평균 점수: " + class2Avg);

        int totalStudent = 0;
        int totalSum = 0;
        for (int i = 0; i < scores.length; i++) {
            totalStudent += scores[i].length;
            for (int j = 0; j < scores[i].length; j++) {
                totalSum += scores[i][j];
            }
        }
        double totalAvg = (double) totalSum / totalStudent;
        System.out.println("전체 평균 점수: " + totalAvg);

    }
}
