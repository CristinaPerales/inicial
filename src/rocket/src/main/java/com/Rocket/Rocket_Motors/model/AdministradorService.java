/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Rocket.Rocket_Motors.model;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Admin
 */
@Service
public class AdministradorService {
    @Autowired
    AdministradorRepository Repository;
    
    public List<Administrador> getAll(){
        return Repository.findAll();
    }
    public void update(Administrador administrador) {
		Administrador l = Repository.getOne(administrador.getId());
		l.setUsuario(administrador.getUsuario());
		l.setContrasenia(administrador.getContrasenia());
		l.setNombre(administrador.getNombre());
		l.setApellidos(administrador.getApellidos());
		Repository.saveAndFlush(l);
	}
    public Administrador getId(long id) {
		return Repository.getOne(id);
    }

	public void add(Administrador administrador) {
		Repository.saveAndFlush(administrador);
	}

	public void delete(long id) {
		Repository.deleteById(id);
	}
}
