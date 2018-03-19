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
public class Clientes {
    private String nombrec;
    private String apellidoc;
    
    public Clientes(String nombrec, String apellidosc){
        this.nombrec = nombrec;
        this.apellidoc = apellidosc;
        
    }//contructor

    /**
     * @return the nombrec
     */
    public String getNombrec() {
        return nombrec;
    }

    /**
     * @param nombrec the nombrec to set
     */
    public void setNombrec(String nombrec) {
        this.nombrec = nombrec;
    }

    /**
     * @return the apellidoc
     */
    public String getApellidoc() {
        return apellidoc;
    }

    /**
     * @param apellidoc the apellidoc to set
     */
    public void setApellidoc(String apellidoc) {
        this.apellidoc = apellidoc;
    }
    
    
    
    
    

}//class
