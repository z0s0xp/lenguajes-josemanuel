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
public class Alumno {
    private String nombre;
    private int edad;
    
    
    
    public Alumno(){
        nombre="";
    edad=12;
    
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
