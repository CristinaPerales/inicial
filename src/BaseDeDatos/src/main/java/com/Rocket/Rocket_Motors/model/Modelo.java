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
public class Modelo {
    @Id
    private long id_modelo;
    private String Modelo;
    
    public Modelo(Modelo modelo){
        this.Modelo=modelo.Modelo;
        this.id_modelo=modelo.id_modelo;
    }
    public long getIdModelo(){
        return id_modelo;
    }
    public void setIdModelo(long id_modelo){
        this.id_modelo=id_modelo;
    }
    public String getModelo(){
        return Modelo;
    }
    public void setModelo(String Modelo){
        this.Modelo=Modelo;
    }
}
