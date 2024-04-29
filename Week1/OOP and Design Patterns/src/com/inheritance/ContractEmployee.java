package com.inheritance;

public class ContractEmployee extends Employee {

    private String contractPeriod;

    public ContractEmployee() {
        super();
        this.contractPeriod = "N/A";
    }

    public ContractEmployee(int id, String name, String mobileNo, String address, String contractPeriod) {
        super(id, name, mobileNo, address);
        this.contractPeriod = contractPeriod;
    }
    
    public String getContractPeriod() {
        return contractPeriod;
    }

    public void setContractPeriod(String contractPeriod) {
        this.contractPeriod = contractPeriod;
    }
}
