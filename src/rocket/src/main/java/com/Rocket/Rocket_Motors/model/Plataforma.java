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
public class Plataforma {
    
    @Id
    private long Id;
    private String Grupo;
    private long Tamanio;
    
    Plataforma(){
        
    }
    Plataforma(Plataforma plataf){
        this.Grupo=plataf.Grupo;
        this.Id=plataf.Id;
        this.Tamanio=plataf.Tamanio;
    }
    public long getId(){
        return Id;
    }
    public void setId(long Id){
        this.Id=Id;
    }
    public String getGrupo(){
        return Grupo;
    }
    public void setGrupo(String Grupo){
        this.Grupo=Grupo;
    }
    public long getTamanio(){
        return Tamanio;
    }
    public void setTamanio(long Tamanio){
        this.Tamanio=Tamanio;
    }
}
