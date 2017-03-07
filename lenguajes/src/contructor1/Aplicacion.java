/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contructor1;

import javax.swing.UIManager;

/**
 *
 * @author z0s0xp
 */
public class Aplicacion {
    public static void main(String[] args) {
        Animal m=new Animal();
        m.setEdad(1);
        System.out.println("La edad del animal es "+m.getEdad());
        
        Alumno a=new Alumno();
        a.setNombre("Edgar");
        System.out.println("El nombre del alumno es"+ a.getNombre());
        
       int x=0;
       int y=23;
       int resultado;
       try{
           
           resultado=y/x;
           
       }catch(Exception hola){
           System.out.println("No se puede realizar esta operacion");
           
           
       }
        
    }
    
}
