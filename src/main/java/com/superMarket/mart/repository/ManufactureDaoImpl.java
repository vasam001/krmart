/**
 * 
 */
package com.superMarket.mart.repository;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.superMarket.mart.model.ManufactureDetails;

/**
 * @author kiran
 *
 */
@Repository
public class ManufactureDaoImpl {
	
	SessionFactory sessionFactory;
	
	/**
	 * @param sessionFactory the sessionFactory to set
	 */
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	public void addManufactute(ManufactureDetails manufactureDetails) {
		Session session = sessionFactory.getCurrentSession();
		session.save(manufactureDetails);
	}
	public void addManufactutes(ManufactureDetails manufactureDetails) {
		Session session = sessionFactory.getCurrentSession();
		session.persist(manufactureDetails);
		session.update(manufactureDetails);
		session.saveOrUpdate(manufactureDetails);
		session.load(manufactureDetails, session);
		session.delete(manufactureDetails);
		
	}
	

}
