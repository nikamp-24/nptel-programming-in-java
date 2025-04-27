/*
Complete the code segment to catch the ArithmeticException in the following, if any.
On the occurrence of such an exception, your program should print “Exception caught: Division by zero.”
If there is no such exception, it will print the result of division operation on two integer values. 
*/

import java.util.Scanner;
  
  public class W05_P3 {
  public static void main(String[] args) { 
      int a, b;
      Scanner input = new Scanner(System.in);
       // Read any two values for a and b
       int result;  

       a = input.nextInt();
       b = input.nextInt();
// try block to divide two numbers and display the result
      try {
              result = a/b;
              System.out.print(result);
     	     }
          // catch block to catch the ArithmeticException
          catch (ArithmeticException e) {
             System.out.print("Exception caught: Division by zero.");
          }
}
}
