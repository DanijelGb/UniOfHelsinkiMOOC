
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int a = 0;
        int b = 0;
        System.out.println("Last number?");
        int majo = Integer.valueOf(scanner.nextLine());

        
        while (b < majo){
            a = a + b + 1;
            b++;
            System.out.println(b);
        }System.out.println("The sum is " + a);

    }
}
