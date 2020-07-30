package org.springframework.samples.petclinic.vet.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.samples.petclinic.vet.VetRepository;
import org.springframework.samples.petclinic.vet.model.Vet;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class VetSameJVMService implements VetService {

    private final VetRepository vetRepo;

    @Autowired
    public VetSameJVMService(VetRepository vetRepo) {
        this.vetRepo = vetRepo;
    }

    @Override
    public Collection<Vet> allVets() {
        return this.vetRepo.findAll();
    }

}