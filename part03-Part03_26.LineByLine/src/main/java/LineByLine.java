
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            String[] splits = input.split(" ");
        

        
            for (String loop: splits) {
            System.out.println(loop);
           }
        }
    }
}
