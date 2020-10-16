package com.pasa.petclinic.services;

import java.util.Set;

import com.pasa.petclinic.model.Vet;

public interface VetService {
	
	Vet findById(Long id);
	
	Vet save(Vet vet);
	
	Set<Vet> findAll();

}
