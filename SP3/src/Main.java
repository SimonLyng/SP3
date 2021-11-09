import java.io.FileNotFoundException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        UI ui = new UI();
         ui.playernameScan();
        KnockoutTournament knockoutTournament = new KnockoutTournament("Bordfodboldturnering", 1,ui.teamnameScan());
        knockoutTournament.Deadline(7);
        knockoutTournament.TeamMatchups(ui.teamnameScan());
    }


}
