
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int highest = 0;
        String name = "bobby";
        
        while (true) {
            String input = scanner.nextLine();
            String[] splits = input.split(",");
           
            if (input.equals("")) {
                break;
            }else if (Integer.valueOf(splits[1]) > highest) {
                highest = Integer.valueOf(splits[1]);
                name = splits[0];
            }
        }
        System.out.println("Age of the oldest: " + name);
    }
}
