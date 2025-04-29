/*
Write a Java program that reads an integer and determines if it is a prime number.
A prime number is only divisible by 1 and itself.
*/

import java.util.Scanner;

public class W08_P4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        int number = scanner.nextInt();
boolean isPrime = true;
if (number <= 1) {
    isPrime = false;
} else {
    for (int i = 2; i * i <= number; i++) {
        if (number % i == 0) {
            isPrime = false;
            break;
        }
    }
}
System.out.println(isPrime ? "Prime" : "Not Prime");
scanner.close();
    }
}
