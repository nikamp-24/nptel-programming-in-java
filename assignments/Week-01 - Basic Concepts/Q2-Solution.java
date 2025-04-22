/*
Q2 - Write a program that demonstrates constructor overloading. Create a class Student with two constructors:

A constructor that accepts name and age 
A constructor that accepts all three attributes: name, age, and grade.
Print the student's information using a method displayInfo().
*/


import java.util.*;
public class Student {
    String name;
    int age;
    String grade;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student(String name, int age, String grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        if(!grade.isEmpty()||grade!=null) System.out.print("Grade: " + grade);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int age = sc.nextInt();
        String grade= null;

        // Check if grade is provided or not
        if(sc.hasNextLine())
        {
         sc.nextLine();
         grade =  sc.nextLine();
         }
        
        // Create the student object
        Student student;
if (grade == null ||grade.isEmpty()) {
            student = new Student(name, age);
        } else {
            student = new Student(name, age, grade);
        }
        
        student.displayInfo();
sc.close();
    }
}
