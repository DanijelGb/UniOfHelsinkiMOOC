
import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Give the first number:");
        int first = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int second = Integer.valueOf(scanner.nextLine());
        
        int ett = first + second;
        int två = first - second;
        int tre = first * second;
        double fyra = 1.0 * first / second;
     
        
        System.out.println(first + " + " + second + " = " + ett);
        System.out.println(first + " - " + second + " = " + två);
        System.out.println(first + " * " + second + " = " + tre);
        System.out.println(first + " / " + second + " = " + fyra);
    }
}
