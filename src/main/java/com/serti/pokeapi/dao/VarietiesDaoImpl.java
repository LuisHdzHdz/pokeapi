package com.serti.pokeapi.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.serti.pokeapi.mdl.Varieties;
import com.serti.pokeapi.util.HibernateUtil;

@Repository
public class VarietiesDaoImpl implements VarietiesDao{
private static final Logger LOGGER = LoggerFactory.getLogger(VarietiesDaoImpl.class);
	
	@SuppressWarnings("deprecation")
	@Override
	public void saveVarietie(Varieties varietie) {
    	LOGGER.info("Varietie to save: {}",varietie.toString());
        try {
        	Session session = HibernateUtil.getSessionFactory().openSession();
        	Transaction tx = session.beginTransaction();
            session.save(varietie);
            tx.commit();
            session.close();
            
        } catch (Exception e) {
        	LOGGER.info("Exception saving specie",e.getLocalizedMessage());
            e.printStackTrace();
        }
		
	}

	@Override
	public boolean existById(String name) {
		Session session = HibernateUtil.getSessionFactory().openSession();
        String hql = "SELECT COUNT(v) FROM Varieties v WHERE v.name = :name";
        Query<Long> query = session.createQuery(hql, Long.class);
        query.setParameter("name", name);
        Long count = query.uniqueResult();
        return count != null && count > 0;
	}

}
