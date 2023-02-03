
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
  
        int nek = 0;
        int dac = 0;
        
        while (true){
            int majo = Integer.valueOf(scanner.nextLine());
            
            if (majo == 0){
                break;
            }else if (majo > 0){
                nek = nek + majo;
                dac = dac + 1;
            }
        }
        double mikili = (double) nek / dac;
        if (nek <= 0){
            System.out.println("Cannot calculate the average");
        }else{
            System.out.println(mikili);
        }
    }
}
