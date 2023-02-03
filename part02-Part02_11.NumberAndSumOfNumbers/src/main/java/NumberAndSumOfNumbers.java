
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int daco = 0;
        int nek = 0;
        
        while (true) {
            System.out.println("Give a number:");
            int majo = Integer.valueOf(scanner.nextLine());
            
            if (majo == 0) {
                break;
            }else{
                daco = daco + 1;
                nek = nek + majo;
            }
        }
        System.out.println("Number of numbers: " + daco);
        System.out.println("Sum of the numbers: " + nek);
    }
}
