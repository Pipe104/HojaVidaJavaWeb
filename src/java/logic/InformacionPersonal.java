/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logic;

/**
 *
 * @author Felipe
 */
public class InformacionPersonal {
    private String nombre;
    private int edad;
    private int nacimiento;
    private String sexo;
    private int telefono;
    private String email;
    private int identificacion;
    
    //Enviar nombre
    public String getNombre(){
        return nombre;
    }
 
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    //Enviar edad
    public int getEdad(){
        return edad;
    }
    
    public void setEdad(int edad){
        this.edad = edad;
    }
    
    //Enviar nacimiento
    public int getNacimiento(){
        return nacimiento;
    }
    
    public void setNacimiento(int nacimiento){
        this.nacimiento = nacimiento;
    }
    
    //Enviar sexo
    public String getSexo(){
        return sexo;
    }
    
    public void setSexo(String sexo){
        this.sexo = sexo;
    }
    
    //Enviar telefono
    public int getTelefono(){
        return telefono;
    }
    
    public void setTelefono(int telefono){
        this.telefono = telefono;
    }
    
    //Enviar email
    public String getEmail(){
        return email;
    }
    
    public void setEmail(String email){
        this.email = email;
    }
    
    //Enviar Identificacion
    public int getIdentificacion(){
        return identificacion;
    }
    
    public void setIdentificacion(int identificacion){
        this.identificacion = identificacion;
    }
}
