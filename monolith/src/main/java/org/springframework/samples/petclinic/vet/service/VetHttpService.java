package org.springframework.samples.petclinic.vet.service;

import org.springframework.samples.petclinic.vet.model.Vet;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.Collection;

public class VetHttpService implements VetService {
    @Override
    public Collection<Vet> allVets() {
        //call http stuff
        //return
        throw new NotImplementedException();
    }
}
