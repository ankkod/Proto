package org.bestdeals.dao;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.bestdeals.model.Deal;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import org.springframework.beans.factory.annotation.Autowired;


public class DealDao {
	
	public static final Logger logger=Logger.getLogger(DealDao.class.getName());
	
	@Autowired
	Deal d;
	public DealDao() {
		// TODO Auto-generated constructor stub
	}
	public void saveDeal(){
		
//		Configuration co
		Configuration con=new Configuration();
		con.addResource("org/bestdeals/model/Deal.hbm.xml");
		con.addResource("hibernate.cfg.xml");
		SessionFactory sessionFactory= con.configure().buildSessionFactory();
		Session session=sessionFactory.openSession();
		Transaction transaction=session.getTransaction();
		transaction.begin();
		logger.log(Level.FINE, "Object", d.toString());
		session.save(d);
		
		session.flush();
		
		transaction.commit();
		session.close();
		sessionFactory.close();

		
		
	}

}
