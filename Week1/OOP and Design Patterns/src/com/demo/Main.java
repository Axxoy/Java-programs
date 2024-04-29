package com.demo;

// // In this example, this is called a controller class. This controls the other classes as we've seen before.

public class Main {

//    JVM starts and ends in the main method.
    public static void main(String[] args) {

        // This is the controller class, calls other classes


        // OOP: 1. Class, 2. Objects, 3. Encapsulation, 4. Inheritance, 5. Polymorphism, 6. Abstraction

        // 1. A class is like basically like a definition of variables and methods all clumped into one. We can
        // also look at it like a user-defined type, or a data structure.
//        the default constructor assigns memory to the address and creates space for it in the heap memory.
//        the default constructor sets all values to default values. like int is 0.
//        You took a screenshot of how constructors work.

        System.out.println("Hello world!");

//        Employee class is defined in Employee.java. There is a syntax you should follow when creating an object:
//        <class_name> <reference_name> = new <class_name>
//        The below line calls the constructor - which is a method that initializes and sets up an object (or instance
//        variable). New keyword calls the constructor.

        Employee Cuneyt = new Employee("Cuneyt Aksoy", "Missouri",
                70000, "Software Engineering");

//        Another term to be familiar with: dependancy injection. Basically like when you inject
//        values and change attributes. Different ways of doing it.
//        dependancy is like the attributes of the class. A good convention to follow is set the
//        attributes as private inside the class. This is the proper guideline.

    }
}