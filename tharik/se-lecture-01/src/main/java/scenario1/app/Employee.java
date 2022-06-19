/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scenario1.app;

import student.*;

/**
 *
 * @author icbt
 */
public class Employee extends Person{
    private String employeeNo;

    public Employee() {
        this.employeeNo = "";
    }

    public Employee(String employeeNo, String nic, String name, String dateOfBirth) {
        super(nic, name, dateOfBirth);
        this.employeeNo = employeeNo;
    }
    
    public String getEmployeeNo() {
        return employeeNo;
    }

    public void setEmployeeNo(String employeeNo) {
        this.employeeNo = employeeNo;
    }
}
