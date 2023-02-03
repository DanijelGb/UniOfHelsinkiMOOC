
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int highest = 0;
        
        while (true) {
            String input = scanner.nextLine();
            String[] splits = input.split(",");
           
            if (input.equals("")) {
                break;
            }else if (Integer.valueOf(splits[1]) > highest) {
                highest = Integer.valueOf(splits[1]);
                
            }
        }
        System.out.println("Age of the oldest: " + highest);
    }
}
