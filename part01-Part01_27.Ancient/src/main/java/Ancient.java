
import java.util.Scanner;

public class Ancient {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here
        System.out.println("Give a year:");
        int bajs = Integer.valueOf(scan.nextLine());
        int hamul = 2015;
        
        if (bajs < hamul){
            System.out.println("Ancient history!");
        }
    }
}
