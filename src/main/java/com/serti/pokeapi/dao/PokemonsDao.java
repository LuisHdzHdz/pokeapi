package com.serti.pokeapi.dao;



import com.serti.pokeapi.mdl.Pokemons;

public interface PokemonsDao {
	public void savePokemon(Pokemons pokemon);
	
	public boolean existById(int id_pokemon);
}
