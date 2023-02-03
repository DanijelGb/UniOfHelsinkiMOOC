import java.util.ArrayList;

public class Stack {
    private ArrayList<String> stack;
    
    public Stack() {
        this.stack = new ArrayList<>();
    }
    
    public boolean isEmpty() {
        if (stack.isEmpty()) {
            return true;
        }
        return false;
    }
    public void add(String value) {
        this.stack.add(value);
    }
    public ArrayList<String> values()  {
        for (String stack : stack) {
            System.out.println(stack);
        }
        return stack;

    }
    public String take() {
       
        return stack.remove(stack.size() -1);
    }
}
