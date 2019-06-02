/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Rocket.Rocket_Motors.model;

import javax.persistence.*;

/**
 *
 * @author Admin
 */
@Entity
@Table
public class Administrador {
    
    @Id
    private long Id;
    private String Usuario;
    private String Contrasenia;
    private String Apellidos;
    private String Nombre;
    
    Administrador(){
        
    }
    Administrador(Administrador admin){
        this.Id=admin.Id;
        this.Apellidos=admin.Apellidos;
        this.Contrasenia=admin.Contrasenia;
        this.Nombre=admin.Nombre;
        this.Usuario=admin.Usuario;
    }
    public long getId(){
        return Id;
    }
    public void setId(long Id){
        this.Id=Id;
    }
    public String getUsuario(){
        return Usuario;
    }
    public void setUsuario(String Usuario){
        this.Usuario=Usuario;
    }
    public String getContrasenia(){
        return Contrasenia;
    }
    public void setContrasenia(String Contrasenia){
        this.Contrasenia=Contrasenia;
    }
    public String getApellidos(){
        return Apellidos;
    }
    public void setApellidos(String Apellidos){
        this.Apellidos=Apellidos;
    }
    public String getNombre(){
        return Nombre;
    }
    public void setNombre(String Nombre){
        this.Nombre=Nombre;
    }
}
