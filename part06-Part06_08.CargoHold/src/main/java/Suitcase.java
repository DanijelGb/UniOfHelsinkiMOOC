import java.util.ArrayList;
import java.util.*;

public class Suitcase {
    private final int maxKG;
    private ArrayList<Item> suitCase;
    
    public Suitcase(int maxKG) {
        this.maxKG = maxKG;
        this.suitCase = new ArrayList<>();
    }
    public int totalWeight() {
        int totalKG = 0;
        for (Item weight: suitCase) {
            totalKG = totalKG + weight.getWeight();
        }
        return totalKG;
    }
    public void addItem(Item item) {
            
    suitCase.add(item);
        if (totalWeight() > maxKG) {
            suitCase.remove(item);
        }
    }
    public void printItems() {
        for (Item allItems: suitCase){
            System.out.println(allItems.getName() + " (" + allItems.getWeight() + " kg)");
        }
    }
    public Item heaviestItem() {
        if (suitCase.isEmpty()){
            return null;
        }
        Item heaviest = suitCase.get(0);
        for (Item allItems: suitCase){
            if (heaviest.getWeight() < allItems.getWeight()) {
                heaviest = allItems;
            }
        }
        return heaviest;
    }
    @Override
    public String toString() {
        String output = suitCase.size() + " items (" + totalWeight() + " kg)";
        if (suitCase.size() == 0) {
            return "no items (0 kg)";
        }
        if (suitCase.size() == 1) {
            return suitCase.size() + " item (" + totalWeight() + " kg)";
        }
        return output;
    }
}
