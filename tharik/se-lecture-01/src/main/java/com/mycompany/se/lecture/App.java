/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.se.lecture;

import icbt.Test2;

/**
 *
 * @author icbt
 */
public class App {
    public static void main(String[] args) {
        System.out.println(Util.score); 

       
        Util u = new Util();
        u.score = 40;
        u.score2 = 30;
        System.out.println("u score : " + u.score);
        System.out.println("u score2 : " + u.score2);
        
        Util u2 = new Util();
        System.out.println("u2 score : " + u2.score);
        System.out.println("u2 score 2 : " + u2.score2);
        
        Test2 t = new Test2();
        
        System.out.println(t.a);
       // System.out.println(t.b);
       // System.out.println(t.c);
      //  System.out.println(t.d);
            
    }
}
