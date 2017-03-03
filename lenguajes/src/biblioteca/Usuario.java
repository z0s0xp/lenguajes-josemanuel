/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;

/**
 *
 * @author T-102
 */
public class Usuario {
  private String nombre;
   String Libros []=new String [5];
    public Usuario() {
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String[] getLibros() {
        return Libros;
    }

    public void setLibros(String[] Libros) {
        this.Libros = Libros;
    }
    
}
