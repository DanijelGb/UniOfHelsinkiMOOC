
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
         System.out.println("Give a string:");
        String dragon = scanner.nextLine();
        
        System.out.println("Give an integer:");
        int crocodile = Integer.valueOf(scanner.nextLine());
        
        System.out.println("Give a double:");
        double fish = Double.valueOf(scanner.nextLine());
        
        System.out.println("Give a boolean:");
        boolean shark = Boolean.valueOf(scanner.nextLine());
        
        
        System.out.println("You gave the string " + dragon);
        System.out.println("You gave the integer " + crocodile);
        System.out.println("You gave the double " + fish);
        System.out.println("You gave the boolean " + shark);

    }
}
