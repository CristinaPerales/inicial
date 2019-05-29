/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Rocket.Rocket_Motors.model;

import java.sql.Timestamp;
import javax.persistence.*;

/**
 *
 * @author Admin
 */
@Entity
@Table
public class Solucion {
    @Id
    private long id_coche;
    @Id
    private long id_usuario;
    private String Solucion;
    private Timestamp Fecha;
    
    Solucion(){
        
    }
    Solucion(long id_coche,long id_usuario,String Solucion,Timestamp fecha){
        this.id_usuario=id_usuario;
        this.id_coche=id_coche;
        this.Solucion=Solucion;
        this.Fecha=fecha;
    }
    public String getSolucion(){
        return Solucion;
    }
    public void setSolucion(String Solucion){
        this.Solucion=Solucion;
    }
    public Timestamp getFecha(){
        return Fecha;
    }
    public void setFecha(Timestamp Fecha){
        this.Fecha=Fecha;
    }
    public long getIdCoche(){
        return id_coche;
    }
    public void setIdCoche(long id_coche){
        this.id_coche=id_coche;
    }
    public long getIdUsuario(){
        return id_usuario;
    }
    public void setIdUsuario(long id_usuario){
        this.id_usuario=id_usuario;
    }
}
