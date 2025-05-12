/*
Delete a Record from a Table Using JDBC*/


import java.sql.*;

public class W11_P3 {
    public static void main(String args[]) {
        try {
            // Set SQLite temp directory (required in sandboxed environments like NPTEL)
            System.setProperty("org.sqlite.tmpdir", "/tempfs");

            // Connect to SQLite database
            Connection conn = DriverManager.getConnection("jdbc:sqlite:/tempfs/db");

            // Create the 'players' table if not already present
            Statement stmt = conn.createStatement();
            String CREATE_TABLE_SQL = "CREATE TABLE IF NOT EXISTS players (UID INT, First_Name VARCHAR(45), Last_Name VARCHAR(45), Age INT);";
            stmt.executeUpdate(CREATE_TABLE_SQL);

            // Clear previous data and insert a new player with UID = 3
            stmt.executeUpdate("DELETE FROM players");
            stmt.executeUpdate("INSERT INTO players VALUES(3, 'Priya', 'Singh', 24)");

            // Prepare the DELETE SQL statement
            String sql = "DELETE FROM players WHERE UID = ?";
            PreparedStatement pstmt = conn.prepareStatement(sql);
pstmt.setInt(1, 3); // Set the UID to delete (placeholder 1 refers to '?')
pstmt.executeUpdate(); // Execute the delete operation

/*
Explanation:
- The DELETE SQL uses one placeholder (?) to specify which UID to match.
- We bind the value 3 to that placeholder using setInt.
- After calling executeUpdate(), the matching row is removed from the database.
*/
// Check if the record still exists (it should not be found)
            ResultSet rs = stmt.executeQuery("SELECT * FROM players WHERE UID = 3");
            while (rs.next()) {
                System.out.println(rs.getInt(1) + "  " +
                                   rs.getString(2) + "  " +
                                   rs.getString(3) + "  " +
                                   rs.getInt(4));
            }

            // Clean up
            conn.close();
        } catch (Exception e) {
            System.out.println(e);
        }
       
    }
}
