package ch04.exercise;

public class Exercise04 {
    public static void main(String[] args) {
        System.out.println("주사위 게임");

        int dice1;
        int dice2;

        int sum;


        do {

            dice1 = (int) (Math.random() * 6) + 1;
            dice2 = (int) (Math.random() * 6) + 1;

            sum = dice1 + dice2;

            System.out.println("눈1:  " + dice1);
            System.out.println("눈2:  " + dice2);
            System.out.println("합:  " + sum);
        } while (sum != 5);
        {
            System.out.println();
            System.out.println("주사위 종료");
        }
    }
}
