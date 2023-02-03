import java.util.ArrayList;

public class TodoList {
    
    private ArrayList<String> List;
    
    public TodoList() {
        this.List = new ArrayList<>();
    }
    public void add(String task) {
        this.List.add(task);
    }
    public void print() {
        int i = 0;
        for (String list: List) {
            i++;
            System.out.println(i + ": " + list);
        }
    }
    public void remove(int number) {
        List.remove(number -1) ;
        
    }
}