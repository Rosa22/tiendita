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
public class Productos {
    
    private String Descripcionproducto;
    private String Claveproducto;
    
    public Productos(String Descripcionproducto, String Claveproducto ){
        this.Descripcionproducto = Descripcionproducto;
        this.Claveproducto = Claveproducto;
    }//constructor

    public String getDescripcionproducto() {
        return Descripcionproducto;
    }

    public void setDescripcionproducto(String Descripcionproducto) {
        this.Descripcionproducto = Descripcionproducto;
    }

    public String getClaveproducto() {
        return Claveproducto;
    }

    public void setClaveproducto(String Claveproducto) {
        this.Claveproducto = Claveproducto;
    }
    
    
    
    
    
    
    
}//class
