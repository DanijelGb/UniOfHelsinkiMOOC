
public class Fitbyte {
    
    private int age, maxHR, restingHR;
    
    public Fitbyte(int age, int restingHeartRate) {
       this.age = age;
       this.restingHR = restingHeartRate;
       this.maxHR = maxHR;
    }
    
    public double targetHeartRate(double percentageOfMaximum) {
        double beats;
        beats = (maxHR-restingHR) * percentageOfMaximum + restingHR;
        
        return beats;
    }
}
