
public class Counter {
    private int startV;
    
    public Counter(int startValue) {
        this.startV = startValue;
    }
    public Counter() {
        this.startV = 0;
    }
    public int value() {
        return startV;
        
    }
    public void increase() {
        startV++;
    }
    public void increase(int increaseBy) {
        if (increaseBy >= 0) {
            startV = startV + increaseBy;
        }
    }
    public void decrease() {
        startV--;
    }
    public void decrease(int decreaseBy) {
        if (decreaseBy >= 0) {
            startV = startV - decreaseBy;
        }
    }
}
