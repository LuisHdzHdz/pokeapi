package com.serti.pokeapi.dao;

import com.serti.pokeapi.mdl.Varieties;

public interface VarietiesDao {
	public void saveVarietie(Varieties varietie);
	public boolean existById(String name);
}
