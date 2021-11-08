import java.util.ArrayList;
import java.util.Date;

public abstract class Tournament {
    private String name;
    private int ID;
    private ArrayList<Team> teams;

    public Tournament(String name, int ID, ArrayList<Team> teams){
        this.name = name;
        this.ID = ID;
        this.teams = teams;
    }
    abstract void TeamMatchups(); //mangler team class

    private Date Deadline; //ikke kaldt i andre klasser
}
