
import java.util.Scanner;


public class Sandbox {

    public static void main(String[] args) {
        // Write your program here
         Scanner scanner = new Scanner(System.in);
        
        System.out.println("Vem är topleverantören i Malmö?");
        String mög = (scanner.nextLine());
        System.out.println("Ditt svar är " + mög);
    }
}
