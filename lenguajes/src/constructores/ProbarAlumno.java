/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructores;

/**
 *
 * @author z0s0xp
 */

import javax.swing.*;
public class ProbarAlumno {
    public static void main (String[] args){
        Alumno a=new Alumno();
        Alumno a2=new Alumno("Juan");
        System.out.println("Tu nombre es\n"+a2.getNombre());
        JFrame ventana=new JFrame("hola");
            ventana.setSize(200,120);
            ventana.setVisible(true);
            
    }
}
