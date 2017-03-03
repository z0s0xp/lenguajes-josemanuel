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
public class Estudiante extends Usuario{

    
    public Estudiante (){
        Usuario a=new Usuario();
        a.setNombre("Juan");
        Libros b=new Libros();
        b.setLibros(Libros);
      System.out.println("El Profesor se llama: "  +a.getNombre()+"Y el libro que saco es:  "+ Arrays.toString(b.getLibros()));
        
    }

    
}
