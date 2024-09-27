package com.serti.pokeapi.mdl;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name = "varieties")
public class Varieties {
	@Column(name = "is_default")
	private boolean is_default;
	@Column(name = "id_pokemon")
	private int id_pokemon;
	@Id
	@Column(name = "name")
	private String name;
	@Column(name = "id_species")
	private int id_species;
	
	public boolean isDefault() {
		return is_default;
	}
	public void setDefault(boolean is_default) {
		this.is_default = is_default;
	}
	public int getId_pokemon() {
		return id_pokemon;
	}
	public void setId_pokemon(int id_pokemon) {
		this.id_pokemon = id_pokemon;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId_species() {
		return id_species;
	}
	public void setId_species(int id_species) {
		this.id_species = id_species;
	}
	@Override
	public String toString() {
		return "Varieties [isDefault=" + is_default + ", id_pokemon=" + id_pokemon + ", name=" + name + ", id_species="
				+ id_species + "]";
	}
	
	
}
