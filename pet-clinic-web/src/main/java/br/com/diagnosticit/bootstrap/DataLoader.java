/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.diagnosticit.bootstrap;

import br.com.diagnosticit.model.Owner;
import br.com.diagnosticit.model.Vet;
import br.com.diagnosticit.services.OwnerService;
import br.com.diagnosticit.services.VetService;
import br.com.diagnosticit.services.map.OwnerServiceMap;
import br.com.diagnosticit.services.map.VetServiceMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 *
 * @author cristiano
 */
@Component
public class DataLoader implements CommandLineRunner{
    
    private final OwnerService ownerService;
    private final VetService vetService;

    @Autowired
    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService   = vetService;
    }
    
        
    @Override
    public void run(String... args) throws Exception {
        
        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstName("Cristiano");
        owner1.setLastName("Carvalho Amaral");
        
        ownerService.save(owner1);
        
        Owner owner2 = new Owner();
        owner2.setId(2L);
        owner2.setFirstName("Silvio Luiz");
        owner2.setLastName("Carvalho Amaral");
        
        ownerService.save(owner2);
        
        System.out.println("Loaded Owners....");
        
        Vet vet1 = new Vet();
        vet1.setId(1L);
        vet1.setFirstName("Julia");
        vet1.setLastName("Amaro");
        
        vetService.save(vet1);
        
        Vet vet2 = new Vet();
        vet2.setId(2L);
        vet2.setFirstName("Carol");
        vet2.setLastName("Souza");
        
        vetService.save(vet2);
        
        System.out.println("Loaded Vets....");
        
    }

    
}
