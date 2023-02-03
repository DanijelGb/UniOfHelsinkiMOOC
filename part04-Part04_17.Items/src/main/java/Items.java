//
import java.util.ArrayList;
import java.util.Scanner;

public class Items {

    public static void main(String[] args) {

        ArrayList<Item> items = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("Enter an item, empty will stop ");
            String name = scanner.nextLine();
            
            if (name.isEmpty()) {
                break;
            }else {
                items.add(new Item(name));
            }
           
        }
        for(Item name: items) {
            System.out.println(name);
        }
        
    }
}
