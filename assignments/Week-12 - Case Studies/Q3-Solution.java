/*
Perform an Operation Based on a Calculator Key*/

import java.util.Scanner;

public class W12_P3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read two numeric values
        double a = sc.nextDouble();
        double b = sc.nextDouble();

        // Read the operator (e.g., '+', '-', '*', '/')
        char op = sc.next().charAt(0);
System.out.println(operate(a, b, op)); // Call the operate method with inputs and print the result


sc.close();
    }

    // Helper method to perform basic arithmetic operations
    public static double operate(double a, double b, char op) {
        switch (op) {
            case '+': return a + b;
            case '-': return a - b;
            case '*': return a * b;
            case '/': return a / b;
            default: return 0.0;
        }
    }
}
