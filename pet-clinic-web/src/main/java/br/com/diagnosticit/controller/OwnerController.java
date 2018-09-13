/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.diagnosticit.controller;

import br.com.diagnosticit.services.OwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author cristiano
 */
@Controller
@RequestMapping("/owners")
public class OwnerController {
    
    private OwnerService ownerService;

    @Autowired
    public OwnerController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }
    
    @RequestMapping({"", "/", "/index", "/index.html"})
    public String listOwners( Model model ){
        model.addAttribute( "owners" , ownerService.findAll());
        return "owners/index";
    }
}
