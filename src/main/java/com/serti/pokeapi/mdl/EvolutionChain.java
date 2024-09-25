package com.serti.pokeapi.mdl;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "evolutionchain")
public class EvolutionChain {
	@Id @Column(name = "evolutionchainId")
	private int id;
	
	@Column(name = "baby_trigger_item")
	private String baby_trigger_item;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBaby_trigger_item() {
		return baby_trigger_item;
	}
	public void setBaby_trigger_item(String baby_trigger_item) {
		this.baby_trigger_item = baby_trigger_item;
	}

	
	@Override
	public String toString() {
		return "EvolutionChain [id=" + id + ", baby_trigger_item=" + baby_trigger_item + "]";
	}	
}
