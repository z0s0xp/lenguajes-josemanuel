/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elimc;

/**
 *
 * @author z0s0xp
 */
public class Imc {
    private Usuario user;
    public Imc(){
        
        user=new Usuario();
    }
    String calcular(){
        float imc=user.getPeso()/(user.getAltura()*user.getAltura());
        return "Este es tu IMC\n"+imc;
    
        
  
    }

    public Usuario getUser() {
        return user;
    }

    public void setUser(Usuario user) {
        this.user = user;
    }
    
}
