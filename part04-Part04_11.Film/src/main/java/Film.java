
public class Film {
    private String filmen;
    private int ålder;
    
    public Film(String filmName, int filmAgeRating) {
        this.filmen = filmName;
        this.ålder = filmAgeRating;
        
    }
    public String name() {
        return filmen;
    }
    public int ageRating() {
        return ålder;
    }
}
