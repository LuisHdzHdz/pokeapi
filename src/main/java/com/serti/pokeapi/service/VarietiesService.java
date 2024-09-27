package com.serti.pokeapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.serti.pokeapi.dao.PokemonsDao;
import com.serti.pokeapi.dao.VarietiesDao;
import com.serti.pokeapi.mdl.Pokemons;
import com.serti.pokeapi.mdl.Varieties;

@Service("varietiesService")
public class VarietiesService {
	
	@Autowired
    VarietiesDao varietiesDao;
	
	public void saveVarietie(Varieties varietie){
		varietiesDao.saveVarietie(varietie);
	}
	
	public boolean existById(String name){
		return varietiesDao.existById(name);
	}
}
