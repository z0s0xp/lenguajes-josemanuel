/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exepciones2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author z0s0xp
 */
public class ModeloLector {
    public String leerArchivo (File file) throws FileNotFoundException, IOException{
        String informacion="nada";
        FileInputStream fis=new FileInputStream(file);
        
       StringBuilder builder=new StringBuilder();
       int ch;
       while((ch=fis.read())!=-1){
           builder.append((char)ch);
       }
       informacion=builder.toString();
        return informacion;
    }
    
}
