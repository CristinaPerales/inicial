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
public class Motor {
    
    @Id
    private long Id;
    private String Fabricante;
    private boolean Turbo;
    private long Cilindrada;
    
    Motor(){
        
    }
    Motor(Motor motor){
        this.Id=motor.Id;
        this.Fabricante=motor.Fabricante;
        this.Cilindrada=motor.Cilindrada;
        this.Turbo=motor.Turbo;
    }
    public Long getId(){
        return Id;
    }
    public void setId(long Id){
        this.Id=Id;
    }
    public String getFabricante(){
        return Fabricante;
    }
    public void setFablicante(String Fabricante){
        this.Fabricante=Fabricante;
    }
    public boolean getTurbo(){
        return Turbo;
    }
    public void setTurbo(boolean Turbo){
        this.Turbo=Turbo;
    }
    public long getCilindrada(){
        return Cilindrada;
    }
    public void setCilindeada(long Cilindrada){
        this.Cilindrada=Cilindrada;
    }
}
