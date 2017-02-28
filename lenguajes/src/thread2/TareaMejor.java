/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thread2;

/**
 *Segunda forma de crear threads implementado la interface runnable
 * @author z0s0xp
 */
public class TareaMejor implements Runnable{
    public static void main(String[] args) {
        Runnable r=new TareaMejor();
        Thread t1=new Thread(r);
        t1.start();
    }

    @Override
    public void run() {
        System.out.println("Soy un thread mejor");
      //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
