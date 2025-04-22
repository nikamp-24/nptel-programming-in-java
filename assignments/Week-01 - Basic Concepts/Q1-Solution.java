/*
Q1 - Write a Java program to create a class Student with the following attributes: 
name, age, and grade. Create a constructor to initialize these attributes. 
Display the student’s information using a method displayInfo().
*/

import java.util.*;

class Student {
    String name;
    int age;
    String grade;

    // Constructor
    public Student(String name, int age, String grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public void displayInfo() {
        System.out.println("Student Name: " + name);
        System.out.println("Age: " + age);
        System.out.print("Grade: " + grade);
    }
}
public class W02_P1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int age = sc.nextInt();
        String grade = sc.next();
Student student = new Student(name, age, grade);
        student.displayInfo();
sc.close();
}
}
