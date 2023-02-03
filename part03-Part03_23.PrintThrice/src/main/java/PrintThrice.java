
import java.util.Scanner;

public class PrintThrice {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a word: ");
        String dac = scanner.nextLine();
        
        System.out.println(dac + dac + dac);

    }
}
