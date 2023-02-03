
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int m = -1;
        int i = 0;
        
        while (true) {
        String input = scanner.nextLine();
        String[] splits = input.split(" ");
        
            if (input.equals("")) {
                break;
            }
            
            for (i = 0; i < splits.length; i++) {
                m++;
            }
            System.out.println(splits[m]);
            m = -1;
        }


    }
}
