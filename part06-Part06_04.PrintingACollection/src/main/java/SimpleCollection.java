
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }
    public String toString() {
        
        String elementz = "";
        for (String list: elements) {
            elementz = elementz + "\n" + list;
        }
        String output = "The collection " + name + " has " + elements.size() + " elements:" + elementz;
        
        if (elements.isEmpty()) {
            return "The collection " + name + " is empty.";
        }
        if (elements.size() == 1) {
        return "The collection " + name + " has " + elements.size() + " element:" + elementz;
        }
    return output;
    }
    
}
