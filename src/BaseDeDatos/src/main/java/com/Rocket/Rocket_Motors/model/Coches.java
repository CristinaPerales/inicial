/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Rocket.Rocket_Motors.model;
import java.sql.Date;
import javax.persistence.*;
/**
 *
 * @author Admin
 */
@Entity
@Table
public class Coches {
    @Id
    private long Id_Coche;
    private long Marca;
    private long Modelo;
    private Date Fecha_Modelo;
    private long Combustible;
    private long Potencia;
    
    Coches(){
        
    }
    Coches(Coches coches){
        this.Combustible=coches.Combustible;
        this.Fecha_Modelo=coches.Fecha_Modelo;
        this.Id_Coche=coches.Id_Coche;
        this.Marca=coches.Marca;
        this.Modelo=coches.Modelo;
        this.Potencia=coches.Potencia;
    }
    public long getIdCoche(){
        return Id_Coche;
    }
    public void setIdCoche(long Id_Coche){
        this.Id_Coche=Id_Coche;
    }
    public long getMarca(){
        return Marca;
    }
    public void setMarca(long Marca){
        this.Marca=Marca;
    }
    public long getModelo(){
        return Modelo;
    }
    public void setModelo(long Modelo){
        this.Modelo=Modelo;
    }
    public Date getFechaModelo(){
        return Fecha_Modelo;
    }
    public void setFechaModelo(Date Fecha_Modelo){
        this.Fecha_Modelo=Fecha_Modelo;
    }
    public long getCombustible(){
        return Combustible;
    }
    public void setCombustible(long Combustible){
        this.Combustible=Combustible;
    }
    public long getPotencia(){
        return Potencia;
    }
    public void setPotencia(long Potencia){
        this.Potencia=Potencia;
    }
}
