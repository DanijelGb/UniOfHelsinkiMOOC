import java.util.ArrayList;

public class Room {
    private ArrayList<Person> people;
    
    public Room () {
        this.people = new ArrayList<>();
    }
    public void add(Person person) {
        people.add(person);
    }
    public boolean isEmpty() {
        if (people.isEmpty()) {
            return true;
        }
        return false;
    }
    public ArrayList<Person> getPersons() {
        
        return people;
    }
    public Person shortest() {
        if (people.isEmpty()) {
            return null;
        }
        Person hello = people.get(0);
        for (Person shortest: people) {
            if (hello.getHeight() > shortest.getHeight()) {
                hello = shortest;
            }
        }
        return hello;
    }
    public Person take() {
        if (people.isEmpty()) {
            return null;
        }
        Person shortest = shortest();
        people.remove(shortest());
        return shortest;
        
    }
}