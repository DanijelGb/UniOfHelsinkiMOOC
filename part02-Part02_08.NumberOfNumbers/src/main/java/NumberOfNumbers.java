
import java.util.Scanner;

public class NumberOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int daco = 0;
        
        while (true){
            System.out.println("Give a number:");
            int neka = Integer.valueOf(scanner.nextLine());
            
            if (neka == 0){
                break;
            } else{
                daco = daco +1;
            }
        }
        System.out.println("Number of numbers: " + daco);

    }
}
