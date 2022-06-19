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
public abstract class Person {
    private String nic;
    private String name;
    private String dateOfBirth;
    
    public Person(){
        this.nic = "";
        this.name = "";
        this.dateOfBirth = "";
    }

    public Person(String nic, String name, String dateOfBirth) {
        this.nic = nic;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
    } 
    
    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}
