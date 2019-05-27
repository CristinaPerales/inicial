/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Rocket.Rocket_Motors.model;
import javax.persistence.*;
import java.sql.Timestamp;
/**
 *
 * @author Admin
 */
@Entity
@Table
public class Fallos {
    @Id
    private long id_coche;
    private String Descripcion;
    private Timestamp Fecha_Creacion;
    private String Titulo;
    
    Fallos(){
        
    }
    Fallos(Fallos fallos){
        this.Descripcion=fallos.Descripcion;
        this.Fecha_Creacion=fallos.Fecha_Creacion;
        this.Titulo=fallos.Titulo;
        this.id_coche=fallos.id_coche;
    }
    public long getIdCoche(){
        return id_coche;
    }
    public void setIdCoche(long id_coche){
        this.id_coche=id_coche;
    }
    public String getDescripcion(){
        return Descripcion;
    }
    public void setDescripcion(String Descripcion){
        this.Descripcion=Descripcion;
    }
    public Timestamp getFechaCreacion(){
        return Fecha_Creacion;
    }
    public void setFechaCreacion(Timestamp Fecha_Creacion){
        this.Fecha_Creacion=Fecha_Creacion;
    }
    public String getTitulo(){
        return Titulo;
    }
    public void setTitulo(String Titulo){
        this.Titulo=Titulo;
    }
}
