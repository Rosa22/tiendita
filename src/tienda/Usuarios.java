/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda;

/**
 *
 * @author rosac
 */
public class Usuarios {
    private String nombreu;
    private String passu;
    
    public Usuarios(String nombreu, String passu){
       this.nombreu = nombreu;
       this.passu = passu;
    }
    
    public void setNombre(String nombreu){
        this.nombreu = nombreu;
    }
    
    public String getNombre(){
        return nombreu;
    }
    
    public void setPass(String passu){
        this.passu = passu;
    }
    public String getPass(){
        return passu;
    }
    
    
    
    
    
    
    
    
}//class
