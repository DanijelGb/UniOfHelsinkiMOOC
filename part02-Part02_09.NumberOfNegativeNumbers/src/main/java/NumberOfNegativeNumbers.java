
import java.util.Scanner;

public class NumberOfNegativeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int daco = 0;
        
        while (true){
            System.out.println("Give a number:");
            int nek = Integer.valueOf(scanner.nextLine());
            
            if (nek == 0){
                break;
            }else if (nek < 0){
                daco = daco + 1;
            }
        }
        System.out.println("Number of negative numbers: " + daco);
    }
}
