import java.util.Scanner;
import java.util.ArrayList;

public class TextUI {
    private SimpleDictionary dictionary;
    private Scanner scanner;
    
    public TextUI(Scanner scanner, SimpleDictionary dictionary) {
        this.dictionary = dictionary;
        this.scanner = scanner;
    }
    public void start() {
        
        while (true) {
            System.out.println("Command: ");
            String command = scanner.nextLine();
            if (command.equals("end")) {
                System.out.println("Bye bye!");
                break;
            }else if (command.equals("add")) {
                System.out.println("Word: ");
                String word = scanner.nextLine();
                
                System.out.println("Translation: ");
                String translation = scanner.nextLine();
                dictionary.add(word, translation);
            }else if (command.equals("search")) {
                System.out.println("To be translated: ");
                String search = scanner.nextLine();
                    if (dictionary.translate(search) != null) {
                        System.out.println("Translation: " + dictionary.translate(search));
                    }else {
                        System.out.println("Word " + search + " was not found");
                    }
            }else {
                System.out.println("Unknown command");
            }
        }
    }
}
