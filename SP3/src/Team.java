import java.util.ArrayList;
//TODO SCANNER READ FROM FILE
public class Team {
    private String teamName;
    private int teamID;
    private ArrayList <Player> team = new ArrayList<Player>();

    public Team(String teamName, int teamID, ArrayList<Player> team) {
        this.teamName = teamName;
        this.teamID = teamID;
        this.team = team;

    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
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