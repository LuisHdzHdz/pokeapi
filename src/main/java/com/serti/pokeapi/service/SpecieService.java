package com.serti.pokeapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.serti.pokeapi.dao.SpeciesDao;
import com.serti.pokeapi.mdl.Species;

@Service("specieService")
public class SpecieService {
	@Autowired
    SpeciesDao speciesDao;
	
	public void saveSpecie(Species specie){
		speciesDao.saveSpecie(specie);
	}
	
	public boolean existById(int speciesid){
		return speciesDao.existById(speciesid);
	}
}
