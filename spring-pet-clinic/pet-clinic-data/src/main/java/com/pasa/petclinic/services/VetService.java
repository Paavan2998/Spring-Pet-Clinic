package com.pasa.petclinic.services;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pasa.petclinic.model.Vet;

public interface VetService extends JpaRepository<Vet, Long> {
	

}
