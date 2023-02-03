
public class Archive {
    private String iD;
    private String name;
   
    public Archive(String iD, String name) {
        this.iD = iD;
        this.name = name;
    }
    
    public boolean equals(Object compared) {
        
        if (this == compared) {
            return true;
        }

        if (!(compared instanceof Archive)) {
            return false;
        }
        
        Archive areTheySame = (Archive) compared;
        
        return this.iD.equals(areTheySame.iD);
        
    }
    @Override
    public String toString() {
        return this.iD + ": " + this.name;
    }
}
