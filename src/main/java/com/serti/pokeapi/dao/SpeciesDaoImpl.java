package com.serti.pokeapi.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.serti.pokeapi.mdl.Species;
import com.serti.pokeapi.util.HibernateUtil;

@Repository
public class SpeciesDaoImpl implements SpeciesDao{
	private static final Logger LOGGER = LoggerFactory.getLogger(SpeciesDaoImpl.class);
	
	@SuppressWarnings("deprecation")
	@Override
	public void saveSpecie(Species specie) {
    	LOGGER.info("Specie to save: {}",specie.toString());
        try {
        	Session session = HibernateUtil.getSessionFactory().openSession();
        	Transaction tx = session.beginTransaction();
            session.save(specie);
            tx.commit();
            session.close();
            
        } catch (Exception e) {
        	LOGGER.info("Exception saving pokemon",e.getLocalizedMessage());
            e.printStackTrace();
        }
		
	}

}
