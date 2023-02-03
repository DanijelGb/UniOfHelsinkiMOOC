
public class Item {
    private String name;
    private int kg;
    
    public Item(String name, int kg) {
        this.name = name;
        this.kg = kg;
    }
    public String getName() {
        return name;
    }
    public int getWeight() {
        return kg;
    }
    public String toString() {
        return name + " (" + kg + "kg)";
    }
}

