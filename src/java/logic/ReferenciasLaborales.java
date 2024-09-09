/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logic;

/**
 *
 * @author laver
 */
public class ReferenciasLaborales extends ReferenciasAbs {
    
    private String RLpersona1;
    private long RLtelefono1;
    private String RLpersona2;
    private long RLtelefono2;
    
    
    //public abstract String getNReferencia1();
    
    @Override
    public String getNReferencia1(){
        return RLpersona1;
    }
    
    @Override
    public void setNReferencia1(String RLpersona1){
        this.RLpersona1 = RLpersona1;
    }
    
    @Override
    public long getTReferencia1(){
        return RLtelefono1;
    }
    
    public void setTReferencia1(long RLtelefono1){
        this.RLtelefono1 = RLtelefono1;
    }
    
    @Override
    public String getNReferencia2(){
        return RLpersona2;
    }
    
    @Override
    public void setNReferencia2( String RLpersona2){
        this.RLpersona2 = RLpersona2;
    }
    
    @Override
    public long getTReferencia2(){
        return RLtelefono2;
    }
    
    public void setTReferencia2(long RLtelefono2){
        this.RLtelefono2 = RLtelefono2;
    }
}
