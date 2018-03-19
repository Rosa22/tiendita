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
public class Facturas {
    private String Fechafactura;
    private float Montofactura;
    private int idventa;
    private int idcliente;
    
    public Facturas(String Fechafactura, float Montofactura, int idventa, int idcliente){
        this.Fechafactura = Fechafactura;
        this.Montofactura = Montofactura;
        this.idventa = idventa;
        this.idcliente = idcliente;
        
        
    }//constructor

    public String getFechafactura() {
        return Fechafactura;
    }

    public void setFechafactura(String Fechafactura) {
        this.Fechafactura = Fechafactura;
    }

    public float getMontofactura() {
        return Montofactura;
    }

    public void setMontofactura(float Montofactura) {
        this.Montofactura = Montofactura;
    }

    public int getIdventa() {
        return idventa;
    }

    public void setIdventa(int idventa) {
        this.idventa = idventa;
    }

    public int getIdcliente() {
        return idcliente;
    }

    public void setIdcliente(int idcliente) {
        this.idcliente = idcliente;
    }
    
    
    
    
    
}//class
