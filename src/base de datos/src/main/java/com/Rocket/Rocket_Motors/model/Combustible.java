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
public class Combustible {
    @Id
    private long id_combustible;
    private String Combustible;
    
    public Combustible(Combustible combustible){
        this.Combustible=combustible.Combustible;
        this.id_combustible=combustible.id_combustible;
    }
    public long getIdCombustible(){
        return id_combustible;
    }
    public void setIdCombustible(long id_combustible){
        this.id_combustible=id_combustible;
    }
    public String getCombustible(){
        return Combustible;
    }
    public void setCombustible(String Combustible){
        this.Combustible=Combustible;
    }
}
