package com.pasa.petclinic.services;

import java.util.Set;

import com.pasa.petclinic.model.Owner;

public interface OwnerService {
	
	Owner findById(Long id);
	
	Owner save(Owner owner);
	
	Set<Owner> findAll();

}
