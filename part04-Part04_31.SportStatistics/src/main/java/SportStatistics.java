
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int i = 0;
        int win = 0;
        int loss = 0;
        
        System.out.println("Filename: ");
        String file = scan.nextLine();
        
        System.out.println("Team: ");
        String team = scan.nextLine();
        
        try (Scanner scanScan = new Scanner(Paths.get(file))) {
            while (scanScan.hasNextLine()) {
                String row = scanScan.nextLine();
                String[] parts = row.split(",");
                
                String first = parts[0];
                String second = parts[1];
                String one = parts[2];
                String two = parts[3];
                
                if (first.contains(team)) {
                    if (Integer.valueOf(one) < Integer.valueOf(two)) {
                        win++;
                        i++;
                    } else {
                        loss++;
                        i++;
                    }
                }else if (second.contains(team)) {
                    if (Integer.valueOf(one) < Integer.valueOf(two)) {
                        win++;
                        i++;
                    } else {
                        loss++;
                        i++;
                }
                
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        System.out.println("Games: " + i);
        System.out.println("Wins: " + win);
        System.out.println("Losses: " + loss);
    }
}