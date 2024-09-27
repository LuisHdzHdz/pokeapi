package com.serti.pokeapi.mdl;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "species")
public class Species {
	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO) 
	@Column(name = "speciesid")
	private int id;
	@Column(name = "name")
	private String name;
	@Column(name = "url")
	private String url;
	@Column(name = "pokemon_id")
	private int pokemon_id;
	
	public int getPokemon_id() {
		return pokemon_id;
	}
	public void setPokemon_id(int pokemon_id) {
		this.pokemon_id = pokemon_id;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	
	@Override
	public String toString() {
		return "Species [id=" + id + ", name=" + name + ", url=" + url + "]";
	}
		
}
