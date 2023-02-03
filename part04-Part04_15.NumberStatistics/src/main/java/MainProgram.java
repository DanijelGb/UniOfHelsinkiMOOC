
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Statistics sum = new Statistics();
        Statistics even = new Statistics();
        Statistics odd = new Statistics();
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numbers:");
        
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            
            if (input == -1) {
                System.out.println("Sum: " + sum.sum());
                System.out.println("Sum of even numbers: " + even.sum());
                System.out.println("Sum of odd numbers: " + odd.sum());
                break;
            } else {
                sum.addNumber(input);
            }
            if (input % 2 == 0) {
                even.addNumber(input);
            }else {
                odd.addNumber(input);
            }
        }
    }
}