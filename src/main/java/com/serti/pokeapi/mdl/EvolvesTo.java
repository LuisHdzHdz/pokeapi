package com.serti.pokeapi.mdl;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name = "evolvesto")
public class EvolvesTo {
	@Id @Column(name = "evolvesid")
	private int id;

	@Column(name = "isbaby")
	private boolean isbaby;
	

	public boolean isIsbaby() {
		return isbaby;
	}
	public void setIsbaby(boolean isbaby) {
		this.isbaby = isbaby;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	@Override
	public String toString() {
		return "EvolvesTo [id=" + id + ", isbaby=" + isbaby +"]";
	}

	
}
