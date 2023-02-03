
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Value of the gift?");
        
        double svar = Double.valueOf(scan.nextLine());
        
        double ett = (100 + (svar - 5000) * 0.08);
        double two = (1700 + (svar - 25000) * 0.10);
        double tre = (4700 + (svar - 55000) * 0.12);
        double fyra = (22100 + (svar - 200000) * 0.15);
        double fem = (142100 + (svar - 1000000) * 0.17);
        
        if (svar < 5000){
            System.out.println("No tax!");
        }else if(svar >= 5000 && svar < 25000){
            System.out.println("Tax: " + ett);
              
        }else if(svar >= 25000 && svar < 55000){
            System.out.println("Tax: " + two);
        
        }else if(svar >= 50000 && svar < 200000.0){
            System.out.println("Tax: " + tre);
            
        }else if(svar >= 200000 && svar < 1000000){
            System.out.println("Tax: " + fyra);
        
        }else if(svar >= 1000000){
            System.out.println("Tax: " + fem);
        }

    }
}
