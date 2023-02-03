
public class Main {

    public static void main(String[] args) {
        
        Gift book = new Gift("Harry Potter and the Philosopher's Stone", 2);
        Gift l1 = new Gift("book",5);
        
        
        Package gifts = new Package();
        gifts.addGift(book);
        gifts.addGift(l1);
        System.out.println(gifts.totalWeight());

    }
}
