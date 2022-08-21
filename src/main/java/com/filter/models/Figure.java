package com.filter.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class , property = ("id"))
public class Figure {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id ;
	private String name ;
	
	@OneToMany(mappedBy = "figure")
	private List<TypeCar> typeCars ;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<TypeCar> getTypeCars() {
		return typeCars;
	}

	public void setTypeCars(List<TypeCar> typeCars) {
		this.typeCars = typeCars;
	}

	public Figure(Integer id, String name, List<TypeCar> typeCars) {
		super();
		this.id = id;
		this.name = name;
		this.typeCars = typeCars;
	}

	public Figure() {

	}

	@Override
	public String toString() {
		return "Figure [id=" + id + ", name=" + name + ", typeCars=" + typeCars + "]";
	}

	
	

}
