/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scenario1.db;

import scenario1.app.Employee;
import scenario1.app.DBUtil;

/**
 *
 * @author icbt
 */
public class MySQLUtil implements DBUtil {

    @Override
    public Employee getEmployee() {
        // Code to access MySQL
        return new Employee();
    }

    @Override
    public boolean addEmployee(Employee e) {
        return true;
    }

    @Override
    public boolean updateEmployee(String empNo) {
         return true;
    }

    @Override
    public boolean deleteEmployee(String empNo) {
         return true;
    }
    
}
