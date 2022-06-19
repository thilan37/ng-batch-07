/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scenario1.app;

import scenario1.db.MongoDBUtil;
import scenario1.bl.BL;

/**
 *
 * @author icbt
 */
public class App {
    public static void main(String[] args) {

        BL b = new BL();
        
        DBUtil util = new MongoDBUtil();
        
        b.process(util);
    }
}
