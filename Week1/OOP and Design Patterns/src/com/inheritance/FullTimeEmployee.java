package com.inheritance;

public class FullTimeEmployee extends Employee {

    private String benefits;

    public FullTimeEmployee(int id, String name, String mobileNo, String address, String benefits) {
        super(id, name, mobileNo, address);
        this.benefits = benefits;
    }

    public FullTimeEmployee() {
        super();
        this.benefits = "Null";
    }

    public String getBenefits() {
        return benefits;
    }

    public void setBenefits(String benefits) {
        this.benefits = benefits;
    }
}
