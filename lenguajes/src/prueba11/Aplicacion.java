/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba11;

/**
 *
 * @author z0s0xp
 */
public class Aplicacion {
    public static void main(String[] args) {
        Alumno a=new Alumno();
        Alumno n=new Alumno();
     int y=0;
     int x=0;
        try{
            System.out.println(y/x);
        n.setNombre("Juanito");
        a.setEdad(13);
        System.out.println("El nombre del alumno es:   "+n.getNombre());
        System.out.println("La edad del alumono es:  "+a.getEdad());
        }catch(Exception alumno){
            System.out.println("Este alumono juanito ya no estudia aqui");
        }
        
    }
    
}
