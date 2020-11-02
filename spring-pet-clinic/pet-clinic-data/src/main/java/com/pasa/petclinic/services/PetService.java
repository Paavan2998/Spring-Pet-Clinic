package com.pasa.petclinic.services;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pasa.petclinic.model.Pet;

public interface PetService extends JpaRepository<Pet, Long>{

}
