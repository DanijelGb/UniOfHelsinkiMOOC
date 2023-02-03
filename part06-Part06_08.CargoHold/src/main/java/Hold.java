import java.util.ArrayList;
import java.lang.Iterable;

public class Hold {
    private int maximumWeight;
    private ArrayList<Suitcase> hold;
    
    public Hold(int maximumWeight) {
        this.maximumWeight = maximumWeight;
        this.hold = new ArrayList<>();
    }
    public void addSuitcase(Suitcase suitcase) {
        hold.add(suitcase);
        if (totalWeight() > maximumWeight) {
            hold.remove(suitcase);
        }
    }
    public int totalWeight() {
        int totalKG = 0;
        for (Suitcase weight: hold) {
            totalKG = totalKG + weight.totalWeight();
        }
        return totalKG;
    }
    public void printItems() {
        for(Suitcase he: hold) {
            he.printItems();
        }
        
    }
    public String toString() {
        
    String output = hold.size() + " suitcases (" + totalWeight() + " kg)";
    
    return output;
    }
}
