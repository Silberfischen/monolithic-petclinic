package org.springframework.samples.petclinic.vet.service;

import java.util.Collection;

public interface VetService {
    Collection<VetDto> allVets();
}
