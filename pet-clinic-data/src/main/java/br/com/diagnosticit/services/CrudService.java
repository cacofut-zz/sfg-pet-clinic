/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.diagnosticit.services;

import br.com.diagnosticit.model.Owner;
import java.util.Set;

/**
 *
 * @author cristiano
 */
public interface CrudService <T, ID>{
    
    Set<T> findAll();
    
    T findById(ID id);
    
    T save(T ID);
    
    void delete(T object);
    
    void deleteById(ID id);
    
}
