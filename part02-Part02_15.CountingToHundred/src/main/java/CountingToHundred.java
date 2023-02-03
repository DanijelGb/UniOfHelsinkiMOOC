
import java.util.Scanner;

public class CountingToHundred {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int majo =  Integer.valueOf(scanner.nextLine());
        
        for (int a = 101; majo < 101; majo++){
            System.out.println(majo);
        }
    }
}
