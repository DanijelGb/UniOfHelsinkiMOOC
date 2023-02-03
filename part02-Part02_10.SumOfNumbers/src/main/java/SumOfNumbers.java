
import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int daco = 0;
        
        while (true){
            System.out.println("Give a number:");
            int nek = Integer.valueOf(scanner.nextLine());
            
            if (nek == 0){
                break;
            }else{
                daco = daco + nek;
            }
        }
        System.out.println("Sum of the numbers: " + daco);
    }
}
