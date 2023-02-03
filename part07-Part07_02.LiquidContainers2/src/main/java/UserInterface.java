import java.util.Scanner;

public class UserInterface {
    private Scanner scan;
    private Container first;
    private Container second;
    
    public UserInterface(Container first, Container second, Scanner scan) {
        this.first = first;
        this.second = second;
        this.scan = scan;
    }
    public void start(){
        System.out.println("First: " + first);
        System.out.println("Second: " + second);
        while (true) {

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            String[] parts = input.split(" ");
            
            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);
            
            if (command.equals("add") && amount >= 0) {
                first.add(amount);
                
                System.out.println("First: " + first);
                System.out.println("Second: " + second);
            }
            else if (command.equals("move") && amount >= 0) {
                if ((first.contains() - amount) >= 0) {
                second.add(amount);
                first.remove(amount);
                } else if ((first.contains() - amount) <= 0 && amount >= 0) {
                    second.add(first.contains());
                    first.remove(second.contains());
                }
                System.out.println("First: " + first);
                System.out.println("Second: " + second);
            }else if (command.equals("remove") && amount >= 0) {
                second.remove(amount);
                
                System.out.println("First: " + first);
                System.out.println("Second: " + second);
            }
        }
    }
}
