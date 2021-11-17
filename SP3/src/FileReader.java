import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileReader implements IO{

        public List<Player> playernameScan(int i) throws FileNotFoundException {
                File playernames = new File("src/Playernames.txt");
                Scanner scanPlayers = new Scanner(playernames);
                //String inputFromFileP = "";
                ArrayList<Player> players = new ArrayList<>();
                while (scanPlayers.hasNextLine()) {
                        //inputFromFileP += scanPlayers.nextLine();
                        players.add(new Player(scanPlayers.nextLine(), false));
                }
                List<Player> split = players.subList(i,i+1);
                return split; //return 2 players.
        }

        //tildel teamnavne fra det her loop til splits + currentword+split ved afsnit
        public ArrayList<Team> teamnameScan() throws FileNotFoundException {
                File _teamnames = new File("src/Teamnames.txt");
                Scanner scanTeams = new Scanner(_teamnames);
                //String inputFromFileT = "";
                ArrayList<Team> teams = new ArrayList<>();
                ArrayList<String> teamnames = new ArrayList<>();
                int i=0;
                while (scanTeams.hasNextLine()) {
                        //inputFromFileT += scanTeams.nextLine();
                        //teamnames.add(scanTeams.nextLine());
                        //List<String> split = teamnames.subList(i, i);
                        teams.add(new Team(scanTeams.nextLine(), i + 1, playernameScan(i)));
                        i++;
                }

                return teams;
        }


}