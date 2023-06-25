/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

/**
 *
 * @author z0s0xp
 */
public class Alumno extends Persona{
 double Promedio;

    public Alumno(double Promedio, String cod, String apnom, String dni) {
        super(cod, apnom, dni);
        this.Promedio = Promedio;
    }

    
        
}
