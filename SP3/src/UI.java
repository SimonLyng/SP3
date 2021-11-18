import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

public class UI {
    static FileReader fileReader;
    static DBConnector dbc;

    public String getUserInput(String msg) {
        System.out.println(msg);
        Scanner scan = new Scanner(System.in);
        System.out.println("Velkommen til turneringen!");
        System.out.println("Tryk 1 for filereader eller 2 for database");

        String input = scan.nextLine();
        return input;
    }

    public String startDialog(String msg) throws FileNotFoundException {
        String input = getUserInput(msg);

        if (input.equalsIgnoreCase("1")) {
            fileReader = new FileReader();
            fileReader.playernameScan(0);
            KnockoutTournament knockoutTournament = new KnockoutTournament("Bordfodboldturnering", 1, fileReader.teamnameScan());
            knockoutTournament.Deadline(7);
            knockoutTournament.TeamMatchups(fileReader.teamnameScan()); //Her bliver der sendt ArrayList af teams med

        } else if (input.equalsIgnoreCase("2")) {
            dbc = new DBConnector();
            dbc.readTeamData();
            KnockoutTournament knockoutTournament = new KnockoutTournament("Bordfodboldturnering", 1, dbc.readTeamData());
            knockoutTournament.Deadline(7);
            knockoutTournament.TeamMatchups(dbc.readTeamData()); //Her bliver der sendt ArrayList af teams med

        } else {
            System.out.println("ugyldigt input");
            startDialog(msg);
        }
        return input;
    }
}