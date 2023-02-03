
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.IOException;

public class GuestListFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        ArrayList<String> list = new ArrayList<>();
        
        try (Scanner fileScan = new Scanner(Paths.get(file))){
            while(fileScan.hasNextLine()) {
                String row = fileScan.nextLine();
                list.add(row);
            }
        }catch (IOException ex) {
            System.out.println("Errors: " + ex);
        }
        // implement reading the file here.
        findFile(file);
        System.out.println("");

        System.out.println("Enter names, an empty line quits.");
        while (true) {
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }

            if (list.contains(name)) {
                System.out.println("The name is on the list.");
            } else {
                System.out.println("The name is not on the list.");
            }
        }

        System.out.println("Thank you!");
        
    }
        
    public static void findFile(String file) {
        
    try (Scanner scanner = new Scanner(Paths.get(file))) {
        
    
        while (scanner.hasNextLine()) {
        // we read one line
        String row = scanner.nextLine();
        // we print the line that we read
        System.out.println(row);
    }

}   catch (Exception e) {
    System.out.println("Error: " + e.getMessage());
}
        
    }
}
