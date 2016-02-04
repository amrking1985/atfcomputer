import java.util.ArrayList;

/**
 * Created by amandaking on 2/2/16.
 */
public class Member {
    private String name;
    private ArrayList<Crime> crimes;
    private String rank;
    private String status;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ArrayList<Crime> getCrimes() {
        return crimes;
    }

    public void setCrimes(ArrayList<Crime> crimes) {
        this.crimes = crimes;
    }
}
