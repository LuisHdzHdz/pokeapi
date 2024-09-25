package com.serti.pokeapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.serti.pokeapi.dao.PokemonsDao;
import com.serti.pokeapi.mdl.Pokemons;

@Service("pokemonsService")
public class PokemonsService {
	
	@Autowired
    PokemonsDao pokemonsDao;
	
	public void savePokemon(Pokemons pokemon){
		pokemonsDao.savePokemon(pokemon);
	}
}
