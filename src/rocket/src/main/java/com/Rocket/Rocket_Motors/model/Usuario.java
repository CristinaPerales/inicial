package com.Rocket.Rocket_Motors.model;

import javax.persistence.*;

@Entity
@Table
public class Usuario {

   @Id 
    private int id;
    private String Username;
    @Column(unique=true, nullable = false)
    private String email;
    private String password;
    private int Nivel;
    
    Usuario(){
    }
    Usuario(Usuario usuario){
        this.id=usuario.id;
        this.Username=usuario.Username;
        this.email=usuario.email;
        this.password=usuario.password;
        this.Nivel=usuario.Nivel;
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
    public String getUsername(){
        return Username;
    }
    public void setUsername(String Username){
        this.Username=Username;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email=email;
    }
    public int getNivel(){
        return Nivel;
    }
    public void setNivel(int Nivel){
        this.Nivel=Nivel;
    }

}
