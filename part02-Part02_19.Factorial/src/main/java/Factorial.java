
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Give a number: ");
        int q = Integer.valueOf(scanner.nextLine()); 
        int a = 0;
        int b = 1;
        
        while (a < q) {
            a++;
            b = b * a;
        } System.out.println("Factorial: " + b);
        
        
    }
}
