/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thread3;

/**
 *tercer forma de crear threads es la que biene en el examen
 * @author z0s0xp
 */
public class LaMejor {
    public static void main(String[] args) {
        Thread t1=new Thread(new Runnable(){
            @Override
            public void run() {
              //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                System.out.println("Soy el mejor");
            }
            
        });
        t1.start();
    }
    
}
