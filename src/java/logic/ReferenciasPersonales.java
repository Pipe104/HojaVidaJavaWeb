/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logic;

/**
 *
 * @author laver
 */
public class ReferenciasPersonales{
    
    private String rPersona1;
    private long rTelefono1;
    private String rPersona2;
    private long rTelefono2;
    
    public String getNReferencia1(){
        return rPersona1;
    }
      
    public void setNReferencia1(String rPersona1){
        this.rPersona1 = rPersona1;
    }
    
    public long getTReferencia1(){
        return rTelefono1;
    }
    
    public void setTReferencia1(long rTelefono1){
        this.rTelefono1 = rTelefono1;
    }
    
    public String getNReferencia2(){
        return rPersona2;
    }
    
    public void setNReferencia2(String rPersona2){
        this.rPersona2 = rPersona2;
    }
    
    public long getTReferencia2(){
        return rTelefono2;
    }
    
    public void setTReferencia2(long rTelefono2){
        this.rTelefono2 = rTelefono2;
    }
}
