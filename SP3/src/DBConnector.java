import java.sql.*;
import java.util.ArrayList;
public class DBConnector implements IO {

    // database URL
    static final String DB_URL = "jdbc:mysql://localhost/sp3";

    //  Database credentials
    static final String USER = "root";
    static final String PASS = "100498Kristian";


    public String[] readTeamData() {
        String[] Team_data = new String[40];
        Connection conn = null;
        Statement stmt = null;
        try {
            //STEP 2: Register JDBC driver
            // Class.forName("com.mysql.jdbc.Driver");

            //STEP 3: Open a connection
            System.out.println("Connecting to database...");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);

            //STEP 4: Execute a query
            System.out.println("Creating statement...");
            stmt = conn.createStatement();

            String sql = "SELECT * FROM sp3";
            ResultSet rs = stmt.executeQuery(sql);

            //STEP 5: Extract data from result set
            while (rs.next()) {
                //Retrieve by column name
                String teamName = rs.getString(1);
                int teamID = rs.getInt("teamID");
                String player1 = rs.getString("player1");
                String player2 = rs.getString("player2");
                Team_data[teamID - 1] = teamName + "," + teamID + "," + player1 + "," + player2;
            }
            //STEP 6: Clean-up environment
            rs.close();
            stmt.close();
            conn.close();
        } catch (SQLException se) {
            //Handle errors for JDBC
            se.printStackTrace();
        } catch (Exception e) {
            //Handle errors for Class.forName
            e.printStackTrace();
        } finally {
            //finally block used to close resources
            try {
                if (stmt != null)
                    stmt.close();
            } catch (SQLException se2) {
            }// nothing we can do
            try {
                if (conn != null)
                    conn.close();
            } catch (SQLException se) {
                se.printStackTrace();
            }//end finally try
        }//end try
        return Team_data;
    }

    public void createTeam(ArrayList<Team> t1){
        Connection conn=null;
        Statement statement=null;
        String sqlquery = "insert into team(tName,player1,player2) values (?,?,?)";
        System.out.println("Connecting to database...");
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        //lav og brug et Prepared Statement objekt
        try {
            PreparedStatement stmt=conn.prepareStatement(sqlquery);

            stmt.setString(1,t1.get(0).getTeamName());
            stmt.setString(2,t1.get(0).getPlayer1());
            stmt.setString(3,t1.get(0).getPlayer2());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }

}