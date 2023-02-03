
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        int m = 0;
        double sum = 0;
        String name = "b";
        
        while (true) {
            String input = scanner.nextLine();
            String[] splits = input.split(",");
           
            if (input.equals("")) {
                break;
            }else if (splits[0].length() > name.length()) {
                name = splits[0];
            }
            i = i + Integer.valueOf(splits[1]);
            m++;

        }
        
        sum = 1.0 * i / m;
        System.out.println("Longest name: " + name);
        System.out.println("Average of the birth years: " + sum);


    }
}
