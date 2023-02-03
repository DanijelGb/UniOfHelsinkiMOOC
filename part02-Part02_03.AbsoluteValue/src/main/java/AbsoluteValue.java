
import java.util.Scanner;

public class AbsoluteValue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int first = Integer.valueOf(scanner.nextLine());
        
        int value = 0;
        int values = first * (-1);
        
        if (first < 0){
            System.out.println(values);
        }else{
            System.out.println(first);
        }

    }
}
