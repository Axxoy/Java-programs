package com.demo;

// In this example, this is called a POJO or Model Class, or Entity class.

public class Employee {

//    Definition of Employee class

    //    These are called the instance variables, or properties
    private String name;
    private String address;
    private int salary;
    private String department;
    //    static attribute
    private static int totalEmployees;

    public Employee(String name, String address, int salary, String department) {
        this.name = name;
        this.address = address;
        this.salary = salary;
        this.department = department;
    }

    public Employee() {
//        Default constructor (non-parameterized). Having 2 constructors is an example of over-loading.
//        Apparently using getters and setters from inside the constructor is a bad idea?? Ask.
        this.name = "Null";
        this.address = "Null";
        this.salary = 0;
        this.department = "N/A";
    }

    public String getName() {
//        remember, getters do not take arguments.
        return name;
    }

    public void setName(String name) {
//        The keyword 'this' holds the address of the current object
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public static int getTotalEmployees() {
        return totalEmployees;
    }
}
