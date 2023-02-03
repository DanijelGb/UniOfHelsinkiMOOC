
import java.util.Scanner;

public class OddOrEven {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here 
        // HINT:
        // You can find out if a number is even or odd easily using the modulo operator %
        // Try the following commands to see what they print
        // int luku = 8
        // System.out.println( luku%2 );
        // So, by taking the modulo of a number and two you can find out if it is even or odd !
        System.out.println("Give a number:");
        int shmat = Integer.valueOf(scan.nextLine());
        int krapp = shmat % 2;
        if (krapp == 0){
            System.out.println("Number " + shmat + " is even");
        }else{
            System.out.println("Number " + shmat + " is odd");
        }
        
    }
    
}
