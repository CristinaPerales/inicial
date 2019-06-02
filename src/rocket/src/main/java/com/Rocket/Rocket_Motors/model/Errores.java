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
public class Errores {
    
    @Id
    private long IdError;
    private String Nombre;
    private String Causa;
    private String Consecuencia;
    private String CocheComun;
    
    Errores(){
        
    }
    Errores(Errores err){
        this.Causa=err.Causa;
        this.CocheComun=err.CocheComun;
        this.Consecuencia=err.Consecuencia;
        this.IdError=err.IdError;
        this.Nombre=err.Nombre;
    }
    public long getIdError(){
        return IdError;
    }
    public void setIdError(long IdError){
        this.IdError=IdError;
    }
    public String getNombre(){
        return Nombre;
    }
    public void setNombre(String Nombre){
        this.Nombre=Nombre;
    }
    public String getCausa(){
        return Causa;
    }
    public void setCausa(String Causa){
        this.Causa=Causa;
    }
    public String getConsecuencia(){
        return Consecuencia;
    }
    public void setConsecuencia(String Consecuencia){
        this.Consecuencia=Consecuencia;
    }
    public String getCocheComun(){
        return CocheComun;
    }
    public void setCocheComun(String CocheComun){
        this.CocheComun=CocheComun;
    }
    
}
