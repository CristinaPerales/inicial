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
public class UsuarioService {
    @Autowired
    UsuarioRepository Repository;
    public List<Usuario> getAll(){
        return Repository.findAll();
    } 
}
