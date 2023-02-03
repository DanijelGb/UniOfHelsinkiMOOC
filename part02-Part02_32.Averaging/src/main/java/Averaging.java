
public class Averaging {

    // implement the sum method here again
    public static int sum(int number1, int number2, int number3, int number4) {
        int hoe = number1 + number2 + number3 + number4;
        return hoe;
    }

    public static double average(int number1, int number2, int number3, int number4) {
        double cock = (1.0 * sum(number1, number2, number3, number4)) / 4;
        return cock;
    }

    public static void main(String[] args) {
        double result = average(-12, 2, 8, 0);
        System.out.println("Average: " + result);
    }
}
