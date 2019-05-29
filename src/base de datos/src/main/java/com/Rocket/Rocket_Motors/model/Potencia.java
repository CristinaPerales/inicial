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
public class Potencia {
    @Id
    private long id_potencia;
    private String Potencia;
    
    public Potencia(Potencia potencia){
        this.Potencia=potencia.Potencia;
        this.id_potencia=potencia.id_potencia;
    }
    public long getIdPotencia(){
        return id_potencia;
    }
    public void setIdPotencia(long id_potencia){
        this.id_potencia=id_potencia;
    }
    public String getPotencia(){
        return Potencia;
    }
    public void setPotencia(String Potencia){
        this.Potencia=Potencia;
    }
}
