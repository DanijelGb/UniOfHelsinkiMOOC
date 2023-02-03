
import java.util.Scanner;

public class LargerThanOrEqualTo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Give the first number:");
        int hola = Integer.valueOf(scan.nextLine());
        System.out.println("Give the second number:");
        int hala = Integer.valueOf(scan.nextLine());
        
        if (hola < hala){
            System.out.println("The greater number is: " + hala);
        }else if (hala < hola){
            System.out.println("The greater number is: " + hola);
        }else{
            System.out.println("The numbers are equal!");
        }

    }
}
