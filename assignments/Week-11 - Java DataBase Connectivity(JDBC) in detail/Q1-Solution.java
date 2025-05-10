/*
Insert Multiple Player Records into a Table Using PreparedStatement*/

import java.sql.*;

public class W11_P1 {
    public static void main(String args[]) {
        try {
            // Establish connection to SQLite database (used in NPTEL sandbox)
            String DB_URL = "jdbc:sqlite:/tempfs/db";
            System.setProperty("org.sqlite.tmpdir", "/tempfs");
            Connection conn = DriverManager.getConnection(DB_URL);

            // Create a Statement to execute SQL commands
            Statement stmt = conn.createStatement();

            // Create the table
            String CREATE_TABLE_SQL = "CREATE TABLE players (UID INT, First_Name VARCHAR(45), Last_Name VARCHAR(45), Age INT);";
            stmt.executeUpdate(CREATE_TABLE_SQL);

            // Prepare the SQL insert statement
            String query = "INSERT INTO players (UID, First_Name, Last_Name, Age) VALUES (?, ?, ?, ?)";
            PreparedStatement preparedStmt = conn.prepareStatement(query);
// Insert first record: Ram Gopal
preparedStmt.setInt(1, 1);
preparedStmt.setString(2, "Ram");
preparedStmt.setString(3, "Gopal");
preparedStmt.setInt(4, 26);
preparedStmt.execute();

// Insert second record: John Mayer
preparedStmt.setInt(1, 2);
preparedStmt.setString(2, "John");
preparedStmt.setString(3, "Mayer");
preparedStmt.setInt(4, 22);
preparedStmt.execute();
// Retrieve all records to verify insertion
            ResultSet rs = stmt.executeQuery("SELECT * FROM players;");
            while (rs.next()) {
                System.out.println(rs.getInt(1) + "  " +
                                   rs.getString(2) + "  " +
                                   rs.getString(3) + "  " +
                                   rs.getInt(4));
            }

            // Close all resources
            conn.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
