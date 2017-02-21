/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exepciones2;

/**
 *
 * @author z0s0xp
 */
import java.io.*;
public class ValidacionArchivo {
  public static void   validarExtencion(File file) throws ExtencionNoValidaException{
 //     throw new ExtencionNoValidaException();
      
     String nombre= file.getName();
    int indice1= nombre.indexOf(".");
    int indice2= nombre.length();
    String extencion=nombre.substring(indice1-1, indice2);
    if(!extencion.endsWith("txt"))
    {
        throw new ExtencionNoValidaException();
        
        
    }
      
      
  }
    
}
