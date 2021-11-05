public class Player {

   private String playerName;
   private Boolean isTeamLeader;

    public Player(String name, Boolean isTeamLeader) {
        this.playerName = name;
        this.isTeamLeader = isTeamLeader;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public Boolean getTeamLeader() {
        return isTeamLeader;
    }

    public void setTeamLeader(Boolean teamLeader) {
        isTeamLeader = teamLeader;
    }
}
