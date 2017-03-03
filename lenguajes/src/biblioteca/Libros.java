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
public class Libros extends Usuario{
    public String Libros []=new String [5];

    public Libros() {
        
        Libros[0]="Quimica";
        Libros[1]="Matematicas";
        Libros[2]="Español";
        Libros[3]="Electronica";
        Libros[4]="Geografia";
    }

    public String[] getLibros() {
        return Libros;
    }

    public void setLibros(String[] Libros) {
        this.Libros = Libros;
    }
    
}
