
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.println("First number?");
        int b = Integer.valueOf(scanner.nextLine());
        System.out.println("Last number?");
        int majo = Integer.valueOf(scanner.nextLine());
        
        int a = b;
        
        while (b < majo){
            a = a + b + 1;
            b++;
            System.out.println(b);
            

        }System.out.println("The sum is " + a);
    }
}
