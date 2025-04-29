/*
Write a Java program that reads an integer from the user and computes its factorial.
Factorial of a number n is calculated as: n! = n * (n-1) * (n-2) * ... * 1
Assume the input is a non-negative integer.
*/


import java.util.Scanner;

public class W08_P2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
       
        int n = scanner.nextInt();
int factorial = 1;
for (int i = 1; i <= n; i++) {
    factorial *= i;
}
System.out.println(factorial);
scanner.close();
    }
}
