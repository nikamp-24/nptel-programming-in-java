/*
Create a class Car with attributes brand and price. Add a method display() to show the car details.
Write a program to create two objects of this class and display their details.
*/


import java.util.*;
public class W02_P4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String brand1 = sc.next();
        int price1 = sc.nextInt();
        String brand2 = sc.next();
        int price2 = sc.nextInt();
class Car {
    String brand;
    int price;

    // Constructor
    Car(String brand, int price) {
        this.brand = brand;
        this.price = price;
    }

    // Display method
    void display(int num) {
        System.out.println("Car " + num + ": " + brand + ", Price: " + price);
    }
}
// Create two objects of Car and display their details
        // Main code
       Car car1 = new Car(brand1, price1);
       Car car2 = new Car(brand2, price2);
       car1.display(1);
       car2.display(2);

        sc.close();
    }
}
