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
    private String nacimiento;
    private String sexo;
    private long telefono;
    private String email;
    private long identificacion;
    private String libreta;
    private String fechaLibreta;
    
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
    public String getNacimiento(){
        return nacimiento;
    }
    
    public void setNacimiento(String nacimiento){
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
    public long getTelefono(){
        return telefono;
    }
    
    public void setTelefono(long telefono){
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
    public long getIdentificacion(){
        return identificacion;
    }
    
    public void setIdentificacion(long identificacion){
        this.identificacion = identificacion;
    }
    
    public String getLibreta(){
        return libreta;
    }
    
    public void setLibreta(String libreta){
        this.libreta = libreta;
    }
    
    public String getFechaLibreta(){
        return fechaLibreta;
    }
    
    public void setFechaLibreta(String fechaLibreta){
        this.fechaLibreta = fechaLibreta;
    }
    
    // Método para obtener la imagen en función del sexo
    public String getImagenSexo() {

        switch (sexo.toLowerCase()) {
            case "femenino":
                return "images/icono_mujer.png"; 
            case "masculino":
                return "images/icono_hombre.png";
            default:
                return "images/otro.png";
        }
    }
}
