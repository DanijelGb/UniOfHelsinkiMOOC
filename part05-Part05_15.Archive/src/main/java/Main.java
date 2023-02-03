
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Archive> product = new ArrayList<>();
        
        while (true) {
            System.out.println("Identifier? (empty will stop)");
            String iD = scanner.nextLine();
            if (iD.equals("")) {
                break;
            }
            
            System.out.println("Name? (empty will stop)");
            String name = scanner.nextLine();
            if (name.equals("")) {
                break;
            }
            Archive hello = new Archive(iD, name);
            if (product.contains(hello)) {
                continue;
            } else {
                product.add(hello);
            }
            
        }
        System.out.println("==Items==");
        
        for (Archive products : product) {
            System.out.println(products);
        }
        
        
        
    }
}
