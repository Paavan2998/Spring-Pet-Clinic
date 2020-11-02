package com.pasa.petclinic.services;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pasa.petclinic.model.Owner;

public interface OwnerService extends JpaRepository<Owner, Long> {
	
	
}
