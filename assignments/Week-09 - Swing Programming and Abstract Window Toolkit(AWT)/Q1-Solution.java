/*
Write a Java program that reads a positive integer from the user and computes the sum of its digits
*/


import java.util.Scanner;

public class W08_P1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        int number = scanner.nextInt();
int sum = 0;
while (number > 0) {
    sum += number % 10;
    number /= 10;
}
System.out.print(sum);
scanner.close();
    }
}
