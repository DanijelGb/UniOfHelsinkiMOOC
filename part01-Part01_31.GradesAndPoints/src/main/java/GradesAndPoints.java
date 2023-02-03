
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give points [0-100]:");
        
        int hej = Integer.valueOf(scan.nextLine());
        
        if (hej < 0){
            System.out.println("Grade: impossible!");
        }else if(hej <= 49){
            System.out.println("Failed!");
        }else if(hej <= 59){
            System.out.println("Grade: 1");
        }else if(hej <= 69){
            System.out.println("Grade: 2");
        }else if(hej <= 79){
            System.out.println("Grade: 3");
        }else if(hej <= 89){
            System.out.println("Grade: 4");
        }else if(hej <= 100){
            System.out.println("Grade: 5");
        }else{
            System.out.println("Grade: incredible!");
        }
    }
}
