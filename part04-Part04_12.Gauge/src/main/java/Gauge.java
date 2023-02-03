
public class Gauge {
    private int value;
    public Gauge() {
    
    }System.out.println("My name is " + this.lastName + ", " + this.firstName + " " + this.lastName);
    
    public void increase() {
        if (value < 5) {
        value++;
        }
    }
    public void decrease() {
        if (value > 0) {
        value = value -1;
        }
    }
    public int value() {
        return value;
    }
    public boolean full() {
        if (value == 5) {
            return true;
        } else {
            return false;
        }
        
    }
}
