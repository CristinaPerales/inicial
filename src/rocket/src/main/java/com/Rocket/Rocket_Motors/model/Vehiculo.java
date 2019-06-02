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
public class Vehiculo {
    @Id
    private long IdCoche;
    private String Marca;
    private String Modelo;
    private String Grupo;
    private long Fiabilidad;
    private long IdMotor;
    private long IdPlataforma;
    private long Fallos;
    
    Vehiculo(){
        
    }
    Vehiculo(Vehiculo coches){
        this.Fiabilidad=coches.Fiabilidad;
        this.Grupo=coches.Grupo;
        this.IdCoche=coches.IdCoche;
        this.Marca=coches.Marca;
        this.Modelo=coches.Modelo;
        this.IdMotor=coches.IdMotor;
        this.IdPlataforma=coches.IdPlataforma;
        this.Fallos=coches.Fallos;
    }
    public long getIdCoche(){
        return IdCoche;
    }
    public void setIdCoche(long Id_Coche){
        this.IdCoche=Id_Coche;
    }
    public String getMarca(){
        return Marca;
    }
    public void setMarca(String Marca){
        this.Marca=Marca;
    }
    public String getModelo(){
        return Modelo;
    }
    public void setModelo(String Modelo){
        this.Modelo=Modelo;
    }
    public String getFechaModelo(){
        return Grupo;
    }
    public void setFechaModelo(String Grupo){
        this.Grupo=Grupo;
    }
    public long getFiabilidad(){
        return Fiabilidad;
    }
    public void setFiabilidad(long Fiabilidad){
        this.Fiabilidad=Fiabilidad;
    }
    public long getIdMotor(){
        return IdMotor;
    }
    public void setIdMotor(long IdMotor){
        this.IdMotor=IdMotor;
    }
    public long getIdPlataforma(){
        return IdPlataforma;
    }
    public void setIdPlataforma(long IdPlataforma){
        this.IdPlataforma=IdPlataforma;
    }
    public long getFallos(){
        return Fallos;
    }
    public void setFallos(long Fallos){
        this.Fallos=Fallos;
    }
}
