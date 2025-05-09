/*
Write a Java program that reads a positive integer from the user and prints its reverse
*/

import java.util.Scanner;

public class W08_P3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);   
        int number = scanner.nextInt();
int reversed = 0;
while (number > 0) {
    reversed = reversed * 10 + number % 10;
    number /= 10;
}
System.out.println(reversed);
scanner.close();
    }
}
