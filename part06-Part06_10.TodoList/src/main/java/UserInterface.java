import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private TodoList list;
    
    public UserInterface(TodoList list, Scanner scanner) {
        this.list = list;
        this.scanner = scanner;
    }
    public void start() {
        while (true) {
            String command = scanner.nextLine();
            if (command.contains("stop")) {
                break;
            }else if (command.contains("add")) {
                String add = scanner.nextLine();
                list.add(add);
            }else if (command.contains("list")) {
                list.print();
            }else if (command.contains("remove")) {
                int remove = Integer.valueOf(scanner.nextLine());
                list.remove(remove);
            }
        }
    }
}