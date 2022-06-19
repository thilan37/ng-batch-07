/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;

/**
 *
 * @author icbt
 */
public class ContractEmployee extends Employee {
    private String contractID;
    private String contractPeriod;

    public ContractEmployee() {
        this.contractID = "";
        this.contractPeriod = "";
    }

    public ContractEmployee(String contractID, String contractPeriod, String employeeNo, String nic, String name, String dateOfBirth) {
        super(employeeNo, nic, name, dateOfBirth);
        this.contractID = contractID;
        this.contractPeriod = contractPeriod;
    }

    public String getContractID() {
        return contractID;
    }

    public void setContractID(String contractID) {
        this.contractID = contractID;
    }

    public String getContractPeriod() {
        return contractPeriod;
    }

    public void setContractPeriod(String contractPeriod) {
        this.contractPeriod = contractPeriod;
    }
}
