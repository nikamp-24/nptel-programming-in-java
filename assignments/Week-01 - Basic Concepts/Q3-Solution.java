/*
Q3 - Write a program to demonstrate the use of this keyword.
  Create a class Rectangle with attributes length and breadth.
  Write a constructor to initialize these values. Also, define a method area() to return the area of the rectangle.
*/

import java.util.*;
public class W02_P3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int breadth = sc.nextInt();
class Rectangle {
    int length, breadth;

    // Constructor
    Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    // Method to calculate area
    int area() {
        return length * breadth;
    }
}
// Create an object of Rectangle and call the area method
        Rectangle r = new Rectangle(length, breadth);
        System.out.print(r.area());

        sc.close();
    }
}
