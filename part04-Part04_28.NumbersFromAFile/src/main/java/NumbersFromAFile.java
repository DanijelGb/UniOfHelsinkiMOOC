
import java.nio.file.Paths;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("File? ");
        String file = scanner.nextLine();
        System.out.println("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.println("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());
        int numbers = 0;
        
        try (Scanner scanScan = new Scanner(Paths.get(file))) {
            while (scanScan.hasNextLine()) {
                String row = scanScan.nextLine();
                
                if (Integer.valueOf(row) >= lowerBound && Integer.valueOf(row) <= upperBound) {
                    numbers++;
                }
            }
            
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        System.out.println("Numbers: " + numbers);

    }

}
