import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Main {
    static FileReader fileReader;
    public static void main(String[] args) throws FileNotFoundException {
       /* Team t1= new Team("Team afvist",1,"Svend","Bent");
        ArrayList<Team> teamList=new ArrayList<>();
        teamList.add(t1);
        DBConnector dbConnector=new DBConnector();
        dbConnector.createTeam(teamList);*/


        fileReader = new FileReader();
        fileReader.playernameScan(0);
        KnockoutTournament knockoutTournament = new KnockoutTournament("Bordfodboldturnering", 1, fileReader.teamnameScan());
        knockoutTournament.Deadline(7);
        knockoutTournament.TeamMatchups(fileReader.teamnameScan()); //Her bliver der sendt ArrayList af teams med
    }

}