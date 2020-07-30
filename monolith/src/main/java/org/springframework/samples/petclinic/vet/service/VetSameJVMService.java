package org.springframework.samples.petclinic.vet.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.samples.petclinic.vet.VetRepository;
import org.springframework.samples.petclinic.vet.model.Specialty;
import org.springframework.samples.petclinic.vet.model.Vet;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class VetSameJVMService implements VetService {

    private final VetRepository vetRepo;

    @Autowired
    public VetSameJVMService(VetRepository vetRepo) {
        this.vetRepo = vetRepo;
    }

    @Override
    public Collection<VetDto> allVets() {
        Collection<Vet> vets = this.vetRepo.findAll();

        Collection<VetDto> mappedVets = new ArrayList<>();

        for (Vet vet : vets) {
            Set<SpecialtyDto> specialtyDtos = new HashSet<>();

            for (Specialty specialty : vet.getSpecialties()) {
                specialtyDtos.add(new SpecialtyDto(specialty.getName()));
            }

            VetDto vetDto = new VetDto(vet.getId(), vet.getFirstName(), vet.getLastName(), specialtyDtos);
            mappedVets.add(vetDto);
        }

        return mappedVets;
    }
}