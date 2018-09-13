/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.diagnosticit.controller;

import br.com.diagnosticit.services.VetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author cristianoca
 */
@Controller
public class VetController {
    
    private VetService vetService;

    @Autowired
    public VetController(VetService vetService) {
        this.vetService = vetService;
    }
           
    @RequestMapping( {"/vets", "/vets/index", "/vets/index.html"} )
    public String index( Model model ){
        model.addAttribute( "vets", vetService.findAll());
        return "vets/index";
    }
}
