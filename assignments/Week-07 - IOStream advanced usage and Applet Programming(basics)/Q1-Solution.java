/*
Implement a Simple Calculator
A Calculator class is provided. Your task is to implement the following:
A parameterized constructor to initialize two numbers.
Methods for addition, subtraction, multiplication, and division.
The division method should handle division by zero and print "Cannot divide by zero!" if attempted
*/


import java.util.Scanner;

class W07_1 {
    private int num1;
    private int num2;
public W07_1(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int add() {
        return num1 + num2;
    }

    public int subtract() {
        return num1 - num2;
    }

    public int multiply() {
        return num1 * num2;
    }

    public int divide() {
        if (num2 == 0) {
            System.out.println("Cannot divide by zero!");
            return 0;
        }
        return num1 / num2;
    }
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        W07_1 calc = new W07_1(a, b);
        System.out.println("Sum: " + calc.add());
        System.out.println("Difference: " + calc.subtract());
        System.out.println("Product: " + calc.multiply());
        System.out.println("Quotient: " + calc.divide());

        scanner.close();
    }
}
