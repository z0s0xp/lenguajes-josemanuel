/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threrds1;

/**
 *Primera forma de crear threrds heredando la clase thread
 * @author z0s0xp
 */
public class TareaMensa extends Thread{

    @Override
    public void run() {
        super.run(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Soy un thread!!!");
    }
    
    
    
}
