
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Give numbers:");
        
        int num = 0;
        int sum = 0;
        int count = 0;
        int even = 0;
        while(true) {
            num = Integer.valueOf(scanner.nextLine());
            if (num==-1) {
                break;
            }
            sum += num;
            count++;
            if (num % 2 == 0) {
                even++;
            }
        }
        double avg = ((double)sum)/count;
        System.out.println("Thx! Bye!");
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + count);
        System.out.println("Average: " + avg);
        System.out.println("Even: " + even);
        System.out.println("Odd: " + (count - even));
        
    }
}
