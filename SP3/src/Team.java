import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class Team {

    private String teamName;
    private int teamID;
    private List<Player> team;
    private String player1;
    private String player2;

    public Team(String teamName, int teamID, List<Player> team) {
        this.teamName = teamName;
        this.teamID = teamID;
        this.team = team;
    }

    //overloading
    public Team(String teamName, int teamID, String player1, String player2){

        this.teamName = teamName;
        this.teamID = teamID;
        this.player1 = player1;
        this.player2 = player2;
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

    public List<Player> getTeam() {
        return team;
    }

    public void setTeam(ArrayList<Player> team) {
        this.team = team;
    }

    public String getPlayer1() {
        return player1;
    }

    public void setPlayer1(String player1) {
        this.player1 = player1;
    }

    public String getPlayer2() {
        return player2;
    }

    public void setPlayer2(String player2) {
        this.player2 = player2;
    }
}