/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threrds1;

/**
 *
 * @author z0s0xp
 */
public class AplicacionThread1 {
    
    public static void main(String[] args) {
        TareaMensa t1=new TareaMensa();
        //Iniciando
        t1.start();
        //en ejecucion
        try{
            Thread.sleep(5000);
            t1.start();
        }catch(InterruptedException e){
            
        }
    }
    
}
