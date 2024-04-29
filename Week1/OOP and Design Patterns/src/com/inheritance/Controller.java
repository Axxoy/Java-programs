package com.inheritance;

public class Controller {

    public static void main(String[] args) {


//    Remember: In Java, if we have a parent class and child classes, we create instances (objects) of the child classes.
//    We DO NOT create instances of the parent class.


//        Creating instance of one of the child classes (FullTimeEmployee)
        FullTimeEmployee cuneyt = new FullTimeEmployee(1, "Cuneyt", "7309782516", "New York", "401K");

        System.out.println(cuneyt.getId());
        System.out.println(cuneyt.getName());
        System.out.println(cuneyt.getMobileNo());
        System.out.println(cuneyt.getAddress());
        System.out.println(cuneyt.getBenefits());

    }
}
