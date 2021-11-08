import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
//TODO SCANNER READ FROM FILE
public class Team {

    private List<String> teamName;
    private int teamID;
    private ArrayList<Player> team;

    public Team(List<String> teamName, int teamID, List<Player> team) {
        this.teamName = teamName;
        this.teamID = teamID;
        this.team = (ArrayList<Player>) team;
    }

    public List<String> getTeamName() {
        return teamName;
    }

    public void setTeamName(List<String> teamName) {
        this.teamName = teamName;
    }

    public int getTeamID() {
        return teamID;
    }

    public void setTeamID(int teamID) {
        this.teamID = teamID;
    }

    public ArrayList<Player> getTeam() {
        return team;
    }

    public void setTeam(ArrayList<Player> team) {
        this.team = team;
    }
}
