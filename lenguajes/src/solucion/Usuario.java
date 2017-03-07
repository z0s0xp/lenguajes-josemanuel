/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solucion;

/**
 *
 * @author z0s0xp
 */
public class Usuario  {
    Libro []libro;
    private String nombre;
    public void setLibro(Libro[] libro){
        this.libro=libro;
    }
    public Libro[] getLibros(){
        return libro;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public Usuario(){}
    public Usuario(Libro[] libro,String nombre){
        this.libro=libro;
        this.nombre=nombre;
    }
    
}
