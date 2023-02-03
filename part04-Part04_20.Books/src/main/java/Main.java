import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        ArrayList<Books> info = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("Title: ");
            String title = scanner.nextLine();
            if (title.isEmpty()) {
                break;
            }
            System.out.println("Pages: ");
            int number = Integer.valueOf(scanner.nextLine());
            System.out.println("Publication year: ");
            int year = Integer.valueOf(scanner.nextLine());
            
            info.add(new Books (title, number, year));
        }
        System.out.println("What information will be printed? ");
        String input = scanner.nextLine();
        if (input.equals("everything")) {
            for (Books index: info) {
                System.out.println(index.getEverything());
            }
        }else if (input.equals("name")) {
            for (Books index: info) {
                System.out.println(index.getName());
            }
        }
        

    }
}
