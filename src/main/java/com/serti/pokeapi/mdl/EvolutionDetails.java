package com.serti.pokeapi.mdl;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "evolutiondetails")
public class EvolutionDetails {
	@Id @Column(name = "evolutiondetailid")
	private int id;
	@Column(name = "gender")
	private String gender;
	@Column(name = "held_item") 
	private String held_item;
	@Column(name = "known_move") 
	private String known_move;
	@Column(name = "known_move_type") 
	private String known_move_type;
	@Column(name = "location") 
	private String location;
	@Column(name = "min_affection") 
	private int min_affection;
	@Column(name = "min_beauty") 
	private int min_beauty;
	@Column(name = "min_happiness") 
	private int min_happiness;
	@Column(name = "min_level") 
	private int min_level;
	@Column(name = "needs_overworld_rain") 
	private String needs_overworld_rain;
	@Column(name = "party_species") 
	private String party_species;
	@Column(name = "party_type") 
	private String party_type;
	@Column(name = "relative_physical_stats") 
	private String relative_physical_stats;
	@Column(name = "time_of_day") 
	private int time_of_day;
	@Column(name = "trade_species") 
	private String trade_species;
	@Column(name = "turn_upside_down") 
	private boolean turn_upside_down;
	
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getHeld_item() {
		return held_item;
	}
	public void setHeld_item(String held_item) {
		this.held_item = held_item;
	}
	public String getKnown_move() {
		return known_move;
	}
	public void setKnown_move(String known_move) {
		this.known_move = known_move;
	}
	public String getKnown_move_type() {
		return known_move_type;
	}
	public void setKnown_move_type(String known_move_type) {
		this.known_move_type = known_move_type;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getMin_affection() {
		return min_affection;
	}
	public void setMin_affection(int min_affection) {
		this.min_affection = min_affection;
	}
	public int getMin_beauty() {
		return min_beauty;
	}
	public void setMin_beauty(int min_beauty) {
		this.min_beauty = min_beauty;
	}
	public int getMin_happiness() {
		return min_happiness;
	}
	public void setMin_happiness(int min_happiness) {
		this.min_happiness = min_happiness;
	}
	public int getMin_level() {
		return min_level;
	}
	public void setMin_level(int min_level) {
		this.min_level = min_level;
	}
	public String getNeeds_overworld_rain() {
		return needs_overworld_rain;
	}
	public void setNeeds_overworld_rain(String needs_overworld_rain) {
		this.needs_overworld_rain = needs_overworld_rain;
	}
	public String getParty_species() {
		return party_species;
	}
	public void setParty_species(String party_species) {
		this.party_species = party_species;
	}
	public String getParty_type() {
		return party_type;
	}
	public void setParty_type(String party_type) {
		this.party_type = party_type;
	}
	public String getRelative_physical_stats() {
		return relative_physical_stats;
	}
	public void setRelative_physical_stats(String relative_physical_stats) {
		this.relative_physical_stats = relative_physical_stats;
	}
	public int getTime_of_day() {
		return time_of_day;
	}
	public void setTime_of_day(int time_of_day) {
		this.time_of_day = time_of_day;
	}
	public String getTrade_species() {
		return trade_species;
	}
	public void setTrade_species(String trade_species) {
		this.trade_species = trade_species;
	}
	public boolean isTurn_upside_down() {
		return turn_upside_down;
	}
	public void setTurn_upside_down(boolean turn_upside_down) {
		this.turn_upside_down = turn_upside_down;
	}

	@Override
	public String toString() {
		return "EvolutionDetails [gender=" + gender + ", held_item=" + held_item + ", known_move=" + known_move
				+ ", known_move_type=" + known_move_type + ", location=" + location + ", min_affection=" + min_affection
				+ ", min_beauty=" + min_beauty + ", min_happiness=" + min_happiness + ", min_level=" + min_level
				+ ", needs_overworld_rain=" + needs_overworld_rain + ", party_species=" + party_species
				+ ", party_type=" + party_type + ", relative_physical_stats=" + relative_physical_stats
				+ ", time_of_day=" + time_of_day + ", trade_species=" + trade_species + ", turn_upside_down="
				+ turn_upside_down+"]";
	}
	
	
}
