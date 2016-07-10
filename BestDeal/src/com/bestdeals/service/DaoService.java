package com.bestdeals.service;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DaoService {

	public DaoService() {
		// TODO Auto-generated constructor stub
		
		
	}
	
	public static Session getSession(){
		Configuration con=new Configuration();
		con.addResource("org/bestdeals/model/Deal.hbm.xml");
		con.addResource("hibernate.cfg.xml");
		SessionFactory sessionFactory= con.configure().buildSessionFactory();
		Session session=sessionFactory.openSession();
		return session;
	}
}
