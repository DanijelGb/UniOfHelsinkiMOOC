
public class Apartment {

    private int rooms;
    private int squares;
    private int pricePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.pricePerSquare = pricePerSquare;
    }
    public int getSquares() {
        return this.squares;
    }
    
    public boolean largerThan(Apartment compared) {
        
        if (this.squares > compared.squares) {
            return true;
        }

        return false;
    }
    public int priceCalculator() {
        return (this.squares * this.pricePerSquare);
    }
    
    public int priceDifference(Apartment compared) {
        int i = compared.priceCalculator();
        int m = this.priceCalculator();
        int n;
        if (i > m) {
            n = i - m;
        } else {
            n = m - i;
        }
        
        return n;
    }
    public boolean moreExpensiveThan(Apartment compared) {
        
        if (this.priceCalculator() > compared.priceCalculator()) {
            return true;
        }
        return false;
    }

}
