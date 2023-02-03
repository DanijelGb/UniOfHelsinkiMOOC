
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }
        

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }
    public Money plus(Money addition) {
        int totalEuros = euros + addition.euros;
        int totalCents = cents + addition.cents;
            
        
        Money newMoney = new Money(totalEuros, totalCents);
    
        return newMoney;

    }
    public boolean lessThan(Money compared) {
        
        if (this.euros < compared.euros) {
            return true;
        }else if (this.euros == compared.euros && this.cents < compared.cents) {
            return true;
        }
        return false;

    }
    public Money minus(Money decreaser) {
        int totalEuros = euros - decreaser.euros;
        int totalCents = cents - decreaser.cents;
        
        if (totalEuros < 0) {
            totalEuros = 0;
            totalCents = 0;
        }
        if (totalCents < 0) {
            totalCents = 100 - decreaser.cents;
            totalEuros = totalEuros - 1;
            totalCents = totalCents % 100;
        }
       
        
        Money newMoney = new Money(totalEuros, totalCents);
    
        return newMoney;

    }

    
    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

}
