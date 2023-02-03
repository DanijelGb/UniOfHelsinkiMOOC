import java.util.ArrayList;
import java.util.Random;

public class JokeManager {
    private ArrayList<String> gotJokes;
    
    public JokeManager() {
        this.gotJokes = new ArrayList<>();
    }
    public void addJoke(String joke) {
        gotJokes.add(joke);
    }
    public String drawJoke() {
        if (gotJokes.isEmpty()) {
            return "Jokes are in short supply.";
        }
        Random draw = new Random();
        int index = draw.nextInt(gotJokes.size());
        return gotJokes.get(index);
    }
    public void printJokes() {
        for (String jokes: gotJokes) {
            System.out.println(jokes);
        }
    }
}
