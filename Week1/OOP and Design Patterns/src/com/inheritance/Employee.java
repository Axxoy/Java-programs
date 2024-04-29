package com.inheritance;

public class Employee {

    private int id;
    private String name;
    private String mobileNo;
    private String address;

    public Employee(int id, String name, String mobileNo, String address) {
        this.id = id;
        this.name = name;
        this.mobileNo = mobileNo;
        this.address = address;
    }

    public Employee() {
        this.id = 0;
        this.name = "Null";
        this.mobileNo = "Null";
        this.address = "Null";
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        name = name;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
