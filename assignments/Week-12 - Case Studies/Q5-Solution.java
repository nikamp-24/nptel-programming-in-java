/*
Replace Symbols with Words in Calculator Expression*/


import java.util.Scanner;

public class W12_P5 {

    // Helper method to format an expression by replacing symbols with words
    public static String formatExpression(String input) {
        String output = input;
        output = output.replace("+", " Plus ");
        output = output.replace("-", " Minus ");
        output = output.replace("*", " Times ");
        output = output.replace("/", " Divided By ");
        return output;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read an expression that contains digits and operators
        String expression = sc.nextLine();
System.out.println(formatExpression(expression)); // Call the formatter and print the output

sc.close();
    }
}
