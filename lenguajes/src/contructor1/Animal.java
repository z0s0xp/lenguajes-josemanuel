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
public class Animal {
    private String Nombre;
    private int Edad;

 public Animal(){  //este es el contructo por defecto
    Edad=1000;
    }

  

    public String getEombre() {
        return Nombre;
    }

    public void setEombre(String Eombre) {
        this.Nombre = Eombre;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }
    
}

