/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contructor1;

/**
 *
 * @author z0s0xp
 */
public class Alumno {
    private String nombre;
    public Alumno(){
        
    }
    
    
    public  Alumno(String nombre){
        nombre="Juanito";
}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
