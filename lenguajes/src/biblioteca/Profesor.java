/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;

import java.util.Arrays;

/**
 *
 * @author T-102
 */
public class Profesor extends Usuario {

    public Profesor() {
        Libros q=new Libros();
        Usuario w=new Usuario();
        
        q.setLibros(Libros);
        w.setNombre("Pedro");
        System.out.println("El ombre del profesor es"+ w.getNombre());
        System.out.println("El o los libros que retiro fueron"+Arrays.toString(q.getLibros()) );
    }
    
    
   
}
