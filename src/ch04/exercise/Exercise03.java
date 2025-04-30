package ch04.exercise;

public class Exercise03 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;


        while (i <= 100) {
            if (i % 3 == 0) {
                sum += i;
            }
            i++;
        }
        System.out.println("1 - 100사이의 3의 배수의 총합은 : " + sum);

        System.out.println("--------------------------");

        int sum2 = 0;
        int j = 0;


        while (j <= 100) {
            sum2 += j;
            j += 3;
        }
        System.out.println("1 - 100사이의 3의 배수의 총합은 : " + sum2);

    }
}
