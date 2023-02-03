
public class Books {
    
    private String name;
    private int pages;
    private int year;

    public Books(String title, int pages, int publicationYear) {
        this.name = title;
        this.pages = pages;
        this.year = publicationYear;
    }
    public String getName() {
        return name;
    }
    public String getEverything() {
        return name + ", " + pages + " pages, " + year;
    }
}
