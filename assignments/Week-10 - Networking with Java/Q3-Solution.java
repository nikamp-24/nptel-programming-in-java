/*
Connect to a SQLite Database Using JDBC
Once a JDBC driver is available, the next step is to establish a connection to a database.
In this task, your job is to connect to a SQLite database using the correct JDBC method.
Java provides the class DriverManager with a method getConnection(String url) to establish the connection.
Your task is to complete the program by writing one line that uses DriverManager.getConnection(...) to connect to the database*/


import java.sql.*; // Required for JDBC classes like Connection and DriverManager

public class W10_P3 {
    public static void main(String[] args) {
        try {
            // Set up a Connection reference to hold the database connection
            Connection conn = null;

            // JDBC URL string pointing to the SQLite database path
            String DB_URL = "jdbc:sqlite:/tempfs/studentdb";

            // This line sets a temporary directory for SQLite to avoid permission issues
            System.setProperty("org.sqlite.tmpdir", "/tempfs");
// This line establishes a connection to the SQLite database using the JDBC URL.
// DriverManager.getConnection(...) returns a Connection object if successful.
// We pass the variable DB_URL which holds the database location.
// This is a standard JDBC pattern used in real-world applications.
conn = DriverManager.getConnection(DB_URL);
// If the connection is successful, conn.isValid(1) will return true
            System.out.println(conn.isValid(1));

            // Always close the connection after use
            conn.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
