package com.pasa.petclinic.model;

import java.io.Serializable;

public class BaseEntity implements Serializable{
	
	private Long id;
//  using box type Long instead of primitive type long is a recommendation of hibernate as box type can be of null value and primitive type cannot

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	

}
