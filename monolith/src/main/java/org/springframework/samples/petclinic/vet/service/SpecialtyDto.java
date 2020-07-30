package org.springframework.samples.petclinic.vet.service;

public class SpecialtyDto {

    private final String name;

    public SpecialtyDto(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
