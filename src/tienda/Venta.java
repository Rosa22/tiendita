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
public class Venta {
    private String Fechaventa;
    private float Montoventa;
    
    public Venta(String Fechaventa, float Montoventa){
        this.Fechaventa = Fechaventa;
        this.Montoventa = Montoventa;
    }//constructor

    public String getFechaventa() {
        return Fechaventa;
    }

    public void setFechaventa(String Fechaventa) {
        this.Fechaventa = Fechaventa;
    }

    public float getMontoventa() {
        return Montoventa;
    }

    public void setMontoventa(float Montoventa) {
        this.Montoventa = Montoventa;
    }

    
    
    
    
    
    



    
}//class

