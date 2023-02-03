
public class Main {

    public static void main(String[] args) {

        // Try out your class here
        Message massage = new Message("Me", "I dont know");
        MessagingService mes = new MessagingService();
        mes.add(massage);
        System.out.println(mes.getMessages());
    }
}
