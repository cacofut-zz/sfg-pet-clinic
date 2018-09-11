/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.diagnosticit.services.map;

import br.com.diagnosticit.model.Vet;
import br.com.diagnosticit.services.CrudService;
import br.com.diagnosticit.services.VetService;
import java.util.Set;
import org.springframework.stereotype.Service;

/**
 *
 * @author cristiano
 */
@Service
public class VetServiceMap extends AbstractMapService<Vet, Long>  implements VetService{

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Vet save(Vet object) {
        return super.save(object.getId(), object);
    }

    @Override
    public void delete(Vet object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    
}
