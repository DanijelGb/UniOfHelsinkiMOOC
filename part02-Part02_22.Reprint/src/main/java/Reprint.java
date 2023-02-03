
import java.util.Scanner;

public class Reprint {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = 0;
        int b = 0;
        System.out.println("How many times?");
        
        for (b = Integer.valueOf(scanner.nextLine()); b > a; a++){
            printText();
           
        }
    }
    
    public static void printText(){
        System.out.println("In a hole in the ground there lived a method");
    }
}
