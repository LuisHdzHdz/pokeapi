package com.serti.pokeapi.dao;


import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;


import com.serti.pokeapi.mdl.Pokemons;
import com.serti.pokeapi.util.HibernateUtil;

@Repository
public class PokemonsDaoImpl implements PokemonsDao {
	private static final Logger LOGGER = LoggerFactory.getLogger(PokemonsDaoImpl.class);
	
	@SuppressWarnings("deprecation")
	@Override
    public void savePokemon(Pokemons pokemon) {
    	LOGGER.info("Pokemon to save: {}",pokemon.toString());
        try {
        	Session session = HibernateUtil.getSessionFactory().openSession();
        	Transaction tx = session.beginTransaction();
            session.save(pokemon);
            tx.commit();
            session.close();
            
        } catch (Exception e) {
        	LOGGER.info("Exception saving pokemon",e.getLocalizedMessage());
            e.printStackTrace();
        }
    }

	@Override
	public boolean existById(int idpokemons) {
		Session session = HibernateUtil.getSessionFactory().openSession();
        String hql = "SELECT COUNT(p) FROM Pokemons p WHERE p.idpokemons = :idpokemons";
        Query<Long> query = session.createQuery(hql, Long.class);
        query.setParameter("idpokemons", idpokemons);
        Long count = query.uniqueResult();
        return count != null && count > 0;
	}



}
