/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.diagnosticit.services.map;

import br.com.diagnosticit.model.Pet;
import br.com.diagnosticit.services.PetService;
import java.util.Set;
import org.springframework.stereotype.Service;

/**
 *
 * @author cristiano
 */
@Service
public class PetServiceMap extends AbstractMapService<Pet, Long>  implements PetService{
    
    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Pet save(Pet object) {
        return super.save(object);
    }

    @Override
    public void delete(Pet object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

}
