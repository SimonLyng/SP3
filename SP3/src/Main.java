import java.io.FileNotFoundException;

public class Main {
    static FileReader fileReader;
    public static void main(String[] args) throws FileNotFoundException {
        fileReader = new FileReader();
        fileReader.playernameScan(0);
        KnockoutTournament knockoutTournament = new KnockoutTournament("Bordfodboldturnering", 1, fileReader.teamnameScan());
        knockoutTournament.Deadline(7);
        knockoutTournament.TeamMatchups(fileReader.teamnameScan()); //Her bliver der sendt ArrayList af teams med
    }


}