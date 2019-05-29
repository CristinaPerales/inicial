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
public class Marca {
    @Id
    private long id_marca;
    private String Marca;
    
    public Marca(Marca marca){
        this.Marca=marca.Marca;
        this.id_marca=marca.id_marca;
    }
    public long getIdMarca(){
        return id_marca;
    }
    public void setIdMarca(long id_marca){
        this.id_marca=id_marca;
    }
    public String getMarca(){
        return Marca;
    }
    public void setMarca(String Marca){
        this.Marca=Marca;
    }
}
