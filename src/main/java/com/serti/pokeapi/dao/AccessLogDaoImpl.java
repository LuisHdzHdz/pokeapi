package com.serti.pokeapi.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.serti.pokeapi.mdl.AccessLog;
import com.serti.pokeapi.util.HibernateUtil;

@Repository
public class AccessLogDaoImpl implements AccesLogDao{
	private static final Logger LOGGER = LoggerFactory.getLogger(AccessLogDaoImpl.class);
	
    public void saveAccesLog(AccessLog accessLog) {
    	LOGGER.info("Acces log to save: {}",accessLog.toString());
        try {
        	Session session = HibernateUtil.getSessionFactory().openSession();
        	Transaction tx = session.beginTransaction();
            session.persist(accessLog);
            tx.commit();
            session.close();
            
        } catch (Exception e) {
        	LOGGER.info("Eception saving log",e.getLocalizedMessage());
            e.printStackTrace();
        }
    }
}
