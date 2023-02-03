
public class Debt {
    private double balance;
    private double interest;
    
    public Debt(double initialBalance, double initialInterestRate) {
        this.balance = initialBalance;
        this.interest = initialInterestRate;
        
    }
    public void printBalance() {
        System.out.println(balance);
        
    }
    public void waitOneYear() {
        this.balance *= interest;
    }
}
