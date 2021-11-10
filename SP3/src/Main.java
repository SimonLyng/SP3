import java.io.FileNotFoundException;

public class Main {
    static Admin admin;
    public static void main(String[] args) throws FileNotFoundException {
        admin = new Admin();
        admin.playernameScan(0);
        KnockoutTournament knockoutTournament = new KnockoutTournament("Bordfodboldturnering", 1, admin.teamnameScan());
        knockoutTournament.Deadline(7);
        knockoutTournament.TeamMatchups(admin.teamnameScan()); //Her bliver der sendt ArrayList af teams med
    }


}