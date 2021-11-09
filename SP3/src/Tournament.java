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

        UI ui=new UI();
        Collections.shuffle(teams);
        System.out.println("Match-ups are: ");
        Team team_1,team_2;
        for(int i=ui.teamnameScan().toArray().length+1;i<=(ui.teamnameScan().toArray().length+1)/2;i++){
            team_1=(ui.teamnameScan().get(0));
            System.out.println(ui.teamnameScan().get(0).getTeamName()+"/n/"+"VS");
            ui.teamnameScan().remove(0);
            team_2=(ui.teamnameScan().get(0));
            System.out.println(ui.teamnameScan().get(0).getTeamName());
            ui.teamnameScan().remove(0);

        }
        System.out.println("To get next round of match-ups, remove losing teams from Teamnames file.");
    }


    public void Deadline(int x) {

        LocalDate currentDate = LocalDate.now();
        LocalDate deadline = LocalDate.now().plusDays(x);
        System.out.println("Tournament is in " + x + " days");
        }
    }

