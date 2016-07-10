package org.bestdeals.dao;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.bestdeals.model.Ask;
import org.bestdeals.model.Deal;
import org.bestdeals.model.Freebies;
import org.bestdeals.model.Voucher;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import org.springframework.beans.factory.annotation.Autowired;

import com.bestdeals.service.DaoService;


public class DealDao {
	
	public static final Logger logger=Logger.getLogger(DealDao.class.getName());
	
/*	@Autowired
	Deal d;*/
	public DealDao() {
		// TODO Auto-generated constructor stub
	}
	public void saveDeal(Deal deal){
		
//		Configuration co
		Session session=DaoService.getSession();
		Transaction transaction=session.getTransaction();
		transaction.begin();
		logger.log(Level.FINE, "Object", deal.toString());
		session.save(deal);
		
		session.flush();
		
		transaction.commit();
		session.close();


		
		
	}
	public void saveAsk(Ask ask){
		
//		Configuration co
		
		Session session=DaoService.getSession();
		Transaction transaction=session.getTransaction();
		transaction.begin();
		logger.log(Level.FINE, "Object", ask.toString());
		session.save(ask);
		
		session.flush();
		
		transaction.commit();
		session.close();
	}
	public void saveFreebie(Freebies freebie){
		
//		Configuration co
		
		Session session=DaoService.getSession();
		Transaction transaction=session.getTransaction();
		transaction.begin();
		logger.log(Level.FINE, "Object", freebie.toString());
		session.save(freebie);
		
		session.flush();
		
		transaction.commit();
		session.close();
	}
	public void saveVoucher(Voucher voucher){
		
//		Configuration co
		
		Session session=DaoService.getSession();
		Transaction transaction=session.getTransaction();
		transaction.begin();
		logger.log(Level.FINE, "Object", voucher.toString());
		session.save(voucher);
		
		session.flush();
		
		transaction.commit();
		session.close();
	}
}
