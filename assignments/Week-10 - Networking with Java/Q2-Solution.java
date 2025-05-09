/*
Check if a JDBC Driver is Available
java uses JDBC drivers to connect to different databases.
Each database (like SQLite, MySQL, PostgreSQL, etc.) has its own JDBC driver.
This program checks whether the SQLite JDBC driver is available in the classpath.
To do that, Java uses Class.forName(...) to try to load the driver class by its name.
Your task is to complete one line of code to load the SQLite driver and print true if the driver is successfully loaded.*/


import java.sql.*;  // Import required for JDBC classes

public class W10_P2 {
    public static void main(String[] args) {
        try {
            // We will attempt to load the SQLite JDBC driver class.
            // If successful, we'll print true.
            // If the driver class isn't available, we'll catch the error and print false.
Class.forName("org.sqlite.JDBC");
// If the driver loads successfully, this line will execute.
            System.out.println(true);
        } catch (Exception e) {
            // If there is any error in loading the driver, this line will execute.
            System.out.println(false);
        }
    }
}
