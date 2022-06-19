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
public class PermenantEmployee extends Employee {
    private String epfNo;

    public PermenantEmployee() {
        this.epfNo = "";
    }

    public PermenantEmployee(String epfNo, String employeeNo, String nic, String name, String dateOfBirth) {
        super(employeeNo, nic, name, dateOfBirth);
        this.epfNo = epfNo;
    }

    public String getEpfNo() {
        return epfNo;
    }

    public void setEpfNo(String epfNo) {
        this.epfNo = epfNo;
    }
}
