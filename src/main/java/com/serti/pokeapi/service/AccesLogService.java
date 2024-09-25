package com.serti.pokeapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.serti.pokeapi.dao.AccesLogDao;
import com.serti.pokeapi.mdl.AccessLog;

@Service("accessLogService")
public class AccesLogService {
	@Autowired
    AccesLogDao accesLogDao;
	
	public void saveAccesLog(AccessLog accessLog){
		accesLogDao.saveAccesLog(accessLog);
	}
}
