/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patos;

/**
 *
 * @author T-102
 */
public class AplicacionPatos {
    
    public static void main(String[] args) {
     int valores []={5,-2,5};
     System.out.println(valores [2]);//exepcion error examen
     int []dos={23, -8};
     int tres []=new int [3];
    
     tres [1]=-100;
     tres [0]=4;
     tres [2]=9;
    
     
     System.out.println(tres[1]);
      for(int i=0;i<3;i++){
          System.out.println(tres[i]);
        
          
          
          
      }
          for(int i: tres){
              System.out.println(i);
              
          }
          String saludo[]={"hola","como","estas"};
     for(String x:saludo){
         System.out.println(x);
     }
  
     ComportamientoVolar patos[]=new ComportamientoVolar[5];
     patos[0]=new PatoMexicano();
     patos[1]=new PatoMexicano();
     patos[2]=new PatoEuropeo();
     patos[3]=new PatoEuropeo();
     patos[4]=new PatoCanadiense();
     for(ComportamientoVolar p:patos){
         p.volar();
     }
    } 
}
