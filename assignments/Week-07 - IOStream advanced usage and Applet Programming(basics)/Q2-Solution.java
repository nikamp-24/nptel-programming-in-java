/*
Implement a Simple Counter
A Counter class is provided. Implement:
A constructor initializing the counter to zero.
Methods to increment(), decrement(), and getValue().
Ensure the counter does not go below zero.
*/

import java.util.Scanner;

class Counter {
    private int count;
// Constructor to initialize counter to zero
    public Counter() {
        this.count = 0;
    }

    // Method to increment the counter
    public void increment() {
        count++;
    }

    // Method to decrement the counter (ensuring it doesn't go below zero)
    public void decrement() {
        if (count > 0) {
            count--;
        }
    }

    // Method to get the current value of the counter
    public int getValue() {
        return count;
    }
}
public class W07_2 {
    public static void main(String[] args) {
        Counter counter = new Counter();
        counter.increment();
        counter.increment();
        counter.decrement();
        System.out.println(counter.getValue()); // Output: 1
    }
}
