/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package icbt2;

/**
 *
 * @author icbt
 */
public class SUV implements Vehicle {
    @Override
    public void move() {
        System.out.println("SUV is moving by rotating all wheels");
    }

    @Override
    public void consume() {
        System.out.println("Car is consuming Diesel");
        
    }
}
