package com.Rocket.Rocket_Motors.model;

import javax.persistence.*;

@Entity
@Table
public class Usuarios {

   @Id 
    private int id;
    private String Nombre;
    private String Apellido1;
    private String Apellido2;
    @Column(unique=true, nullable = false)
    private String email;
    private String password;
    private String foto;
    private String descripcion;
    private char rol;
    
    Usuarios(){
    }
    Usuarios(int id,String Nombre,String Apellido1,String email,String password,char rol){
        this.id=id;
        this.Nombre=Nombre;
        this.Apellido1=Apellido1;
        this.email=email;
        this.password=password;
        this.rol=rol;
    }
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public String getNombre(){
        return Nombre;
    }
    public void setNombre(String Nombre){
        this.Nombre=Nombre;
    }
    public String getApellido1(){
        return Apellido1;
    }
    public void setApellido1(String Apellido1){
        this.Apellido1=Apellido1;
    }
    public String getApellido2(){
        return Apellido2;
    }
    public void setApellido2(String Apellido2){
        this.Apellido2=Apellido2;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email=email;
    }
    public String getFoto(){
        return foto;
    }
    public void setFoto(String foto){
        this.foto=foto;
    }
    public String getDescripcion(){
        return descripcion;
    }
    public void setDescripcion(String descripcion){
        this.descripcion=descripcion;
    }
    public char getRol(){
        return rol;
    }
    public void setRol(char rol){
        this.rol=rol;
    }
}
