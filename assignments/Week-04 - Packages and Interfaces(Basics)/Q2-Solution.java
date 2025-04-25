/*
Complete the code segment to print the current year.
Your code should compile successfully.
*/

// The following is the declaration of the main class named Main
public class Main{ 
	public static void main(String args[]){
		int year; // integer type variable to store year	

                 // Create an object of Calendar class. 
                 java.util.Calendar current; 

                // Use getInstance() method to initialize the Calendar object.
                 current = java.util.Calendar.getInstance();
// Initialize the int variable year with the current year
year = current.get(current.YEAR);
// Print the current Year
System.out.println("Current Year: "+year);

}
}
