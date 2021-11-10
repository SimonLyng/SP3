import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;

public abstract class Tournament {
    private String name;
    private int ID;
    private ArrayList<Team> teams;


    public Tournament(String name, int ID, ArrayList<Team> teams)   {
        this.name = name;
        this.ID = ID;
        this.teams = teams;
    }

    void TeamMatchups(ArrayList<Team> teams) throws FileNotFoundException {


        Collections.shuffle(teams);
        System.out.println("Match-ups are: ");
        Team team_1,team_2;
        int i=0;
        for(int j=0;j<teams.size()-1;j+=2){
            team_1=teams.get(j);
            System.out.println(team_1.getTeamName()+"\n"+"VS");
            team_2=teams.get(j+1);
            System.out.println(team_2.getTeamName()+"\n");


        }
        System.out.println("To get next round of match-ups, remove losing teams from Teamnames file.");
    }


    public void Deadline(int x) {

        LocalDate currentDate = LocalDate.now();
        LocalDate deadline = LocalDate.now().plusDays(x);
        System.out.println("Tournament is in " + x + " days");
    }
}