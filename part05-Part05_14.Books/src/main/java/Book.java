
public class Book {

    private String name;
    private int publicationYear;

    public Book(String name, int publicationYear) {
        this.name = name;
        this.publicationYear = publicationYear;
    }
    public boolean equals(Object compared) {
        
        if (this == compared) {
            return true;
        }

        // if the object is not instance of SimpleDate, the objects are not the same
        if (!(compared instanceof Book)) {
            return false;
        }
        
        Book areTheySame = (Book) compared;
        
        if (this.name.equals(areTheySame.getName())
            && (this.publicationYear == areTheySame.getPublicationYear())) {
          
            return true;
        }
        return false;
    }

    public String getName() {
        return name;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

}
