
import java.util.Scanner;

public class FirstWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
        String input = scanner.nextLine();
        String[] splits = input.split(" ");
        
            if (input.equals("")) {
                break;
            }
            System.out.println(splits[0]);
        }
        
    }
}
