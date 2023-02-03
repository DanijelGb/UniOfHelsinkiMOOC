
import java.util.Scanner;

public class Orwell {

    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);

        // Write your program here
        System.out.println("Give a number:");
        
        int bajs = Integer.valueOf(scann.nextLine());
        int hozza = 1984;
        
        if (bajs == hozza){
            System.out.println("Orwell");
        }
    }
}
