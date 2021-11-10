import java.io.FileNotFoundException;
import java.util.List;

public class Main {
    static UI ui;
    public static void main(String[] args) throws FileNotFoundException {
        ui = new UI();
        ui.playernameScan(0);
        KnockoutTournament knockoutTournament = new KnockoutTournament("Bordfodboldturnering", 1,ui.teamnameScan());
        knockoutTournament.Deadline(7);
        knockoutTournament.TeamMatchups(ui.teamnameScan()); //Her bliver der sendt ArrayList af teams med
    }


}