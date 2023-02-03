
import java.util.Scanner;

public class OnlyPositives {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int daco = 0;
        int nek = 0;
        
        
        while (true) {
            System.out.println("Give a number:");
            int majo = Integer.valueOf(scanner.nextLine());
            
            if (majo == 0){
                break;
            }else{
                nek = nek + 1;
                daco = daco + majo;
            }
        }
        double mikili = (double) daco / nek;
        System.out.println("Average of the numbers: " + mikili);

    }
}
