package com.alvaro.web.app.model;

import java.io.Serializable;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
//esto es para que las anotaciones queden sobre el campo y no sobre la propiedad
@Access(AccessType.FIELD)
public class ParentEntity implements Serializable {

	
	private static final long serialVersionUID = 8095208178667125751L;

	//atributos de javax persistence
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id", unique=true, nullable=false)
	private Long id;

	
	//los inmutadores son declarados como ultimo miembro
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	
}
