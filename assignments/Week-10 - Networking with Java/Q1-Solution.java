/*
Import the Right Packages 
Write a Java program that connects to a database using JDBC (Java Database Connectivity).
However, the code will not compile unless you import the correct packages.
Your task is to add the correct import statements so that the program compiles and runs properly.
Even if you have never worked with JDBC, this is a basic puzzle-style task.
Simply use your understanding of Java import statements and hints in the code to figure out what to include at the top.*/


// Add the required import statements below

// This import is used to work with databases in Java.
// 'Connection' is a class that helps you create a connection between your Java program and the database.
import java.sql.Connection;

// 'DriverManager' is a class that manages a set of database drivers.
// It is used to establish a connection with the database using a URL, username, and password.
import java.sql.DriverManager;

// The following import is technically not needed because 'java.lang' is automatically imported in every Java program.
// But if you're curious: it contains core classes like String, Math, Object, System, etc.
import java.lang.*; // You can remove this line; it's optional and redundant.
public class W10_P1 {
    public static void main(String args[]) {
        try {
            Connection conn = null;
            String DB_URL = "jdbc:sqlite:/tempfs/db";
            System.setProperty("org.sqlite.tmpdir", "/tempfs");

            // Try to connect to the database
            conn = DriverManager.getConnection(DB_URL);
            System.out.print(conn.isValid(1));

            conn.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
