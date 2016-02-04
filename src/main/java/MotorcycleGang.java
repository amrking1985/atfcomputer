import java.util.ArrayList;

/**
 * Created by amandaking on 2/2/16.
 */

public class MotorcycleGang {
    private long id;
    private String nameOfGang;
    private String locations;
    private ArrayList<Member> members;


    public String getNameOfGang() {
        return nameOfGang;
    }

    public void setNameOfGang(String nameOfGang) {
        this.nameOfGang = nameOfGang;
    }

    public String getLocations() {
        return locations;
    }

    public void setLocations(String locations) {
        this.locations = locations;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public ArrayList<Member> getMembers() {
        return members;
    }

    public void setMembers(ArrayList<Member> members) {
        this.members = members;
    }
}
