package com.serti.pokeapi.mdl;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "pokemons")
public class Pokemons {
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private int idpokemons;
	@Column(name = "name")
	private String name;
	@Column(name = "base_experience")
	private int base_experience;
	@Column(name = "hieght")
	private int hieght;
	@Column(name = "is_default")
	private boolean is_default;
	@Column(name = "weight")
	private int weight;
	@Column(name = "id_evolution_chain")
	private int id_evolution_chain;
	
	public int getIdpokemons() {
		return idpokemons;
	}
	public void setIdpokemons(int idpokemons) {
		this.idpokemons = idpokemons;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBase_experience() {
		return base_experience;
	}
	public void setBase_experience(int base_experience) {
		this.base_experience = base_experience;
	}
	public int getHieght() {
		return hieght;
	}
	public void setHieght(int hieght) {
		this.hieght = hieght;
	}
	public boolean isIs_default() {
		return is_default;
	}
	public void setIs_default(boolean is_default) {
		this.is_default = is_default;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int getId_evolution_chain() {
		return id_evolution_chain;
	}
	public void setId_evolution_chain(int id_evolution_chain) {
		this.id_evolution_chain = id_evolution_chain;
	}
	
	
	
}
