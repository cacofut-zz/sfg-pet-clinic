/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.diagnosticit.services;

import br.com.diagnosticit.model.Pet;
import java.util.Set;

/**
 *
 * @author cristiano
 */
public interface PetService {
    
        
    Pet findById(Long id);
    
    Pet save(Pet pet);
    
    Set<Pet> findAll();
    
}
