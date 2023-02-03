import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList<TelevisionProgram> programs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("Name: ");
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }
            System.out.println("Duration: ");
            int time = Integer.valueOf(scanner.nextLine());
            
            programs.add(new TelevisionProgram(name, time));
        }
        System.out.println("Program's maximum duration? ");
        int input = Integer.valueOf(scanner.nextLine());
        for (TelevisionProgram data: programs) {
            if (data.getDuration() <= input) {
                System.out.println(data);
            }
        }

    }
}
