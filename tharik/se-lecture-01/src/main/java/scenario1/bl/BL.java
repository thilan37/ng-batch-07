/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scenario1.bl;

import scenario1.app.DBUtil;
import scenario1.app.Employee;

/**
 *
 * @author icbt
 */
public class BL {
    public void process(DBUtil util) {
        Employee e = new Employee();
        
        util.addEmployee(e);
        
        
        util.deleteEmployee("1");
        
        util.updateEmployee("1");
        
        util.getEmployee();
    }
}
