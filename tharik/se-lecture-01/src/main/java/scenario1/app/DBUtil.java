/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scenario1.app;

/**
 *
 * @author icbt
 */
public interface DBUtil {
    Employee getEmployee();
    boolean addEmployee(Employee e);
    boolean updateEmployee(String empNo);
    boolean deleteEmployee(String empNo);
}
