import java.time.LocalDate;

public class Match {
    private Team team1;
    private Team team2;

    public Match(Team team1, Team team2) {
        this.team1 = team1;
        this.team2 = team2;
    }
    //TODO DATE
    void setDate(){

    }
    private String getDate(){
        return "";
    }
    public void Deadline(int x){

        LocalDate currentDate = LocalDate.now();
        LocalDate deadline = LocalDate.now().plusDays(x);
        if (currentDate.isAfter(deadline)) {

        }
    }
}