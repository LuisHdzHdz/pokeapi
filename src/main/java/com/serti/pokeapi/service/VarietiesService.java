package com.serti.pokeapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.serti.pokeapi.dao.VarietiesDao;
import com.serti.pokeapi.mdl.Varieties;

@Service("varietiesService")
public class VarietiesService {
	
	@Autowired
    VarietiesDao varietiesDao;
	
	public void saveVariety(Varieties variety){
		varietiesDao.saveVarietie(variety);
	}
	
	public boolean existById(String name){
		return varietiesDao.existById(name);
	}
}
