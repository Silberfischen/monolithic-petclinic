package org.springframework.samples.petclinic.vet.service;

import org.springframework.beans.support.MutableSortDefinition;
import org.springframework.beans.support.PropertyComparator;

import java.util.*;

public class VetDto {

    private final Integer id;

    private final String firstName;

    private final String lastName;

    private final Set<SpecialtyDto> specialties;

    public VetDto(Integer id, String firstName, String lastName, Set<SpecialtyDto> specialties) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.specialties = specialties;
    }

    public Integer getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }


    protected Set<SpecialtyDto> getSpecialtiesInternal() {
        if (this.specialties == null) {
            return new HashSet<>();
        }
        return this.specialties;
    }

    public List<SpecialtyDto> getSpecialties() {
        List<SpecialtyDto> sortedSpecs = new ArrayList<>(getSpecialtiesInternal());
        PropertyComparator.sort(sortedSpecs, new MutableSortDefinition("name", true, true));
        return Collections.unmodifiableList(sortedSpecs);
    }

    public int getNrOfSpecialties() {
        return getSpecialtiesInternal().size();
    }

}
