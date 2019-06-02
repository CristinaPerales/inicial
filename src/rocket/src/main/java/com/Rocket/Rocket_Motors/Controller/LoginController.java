/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Rocket.Rocket_Motors.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author Admin
 */
@Controller
public class LoginController {

    @GetMapping("/")
    public String loginView(Model model) {

            /*Authentication auth = SecurityContextHolder.getContext().getAuthentication();

            if (!(auth instanceof AnonymousAuthenticationToken)) {
                return "index";
            }*/
            return "index";
    }
    @GetMapping("/login")
    public String logView(Model model){
        
        return "login";
    }
    @GetMapping("/index")
    public String indexView(Model model){
        
        return "index";
    }
}
