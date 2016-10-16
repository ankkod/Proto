package org.bestdeals.dao;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.apache.jasper.tagplugins.jstl.core.ForEach;
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
		logger.log(Level.FINE, "new deal", deal.toString());
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
		logger.log(Level.FINE, "new ask", ask.toString());
		session.save(ask);
		
		session.flush();
		
		transaction.commit();
		session.close();
	}
	
	
	
	public Deal getDeal(int dealId){
		Session session=DaoService.getSession();
		Deal deal=session.get(Deal.class, dealId);
		return deal;
	}
	
	public List<Deal> getDeals(){
		Session session=DaoService.getSession();
		List<Deal> allDeals=session.createQuery("from Deal").list();
		List<Deal> deals=new ArrayList<Deal>();
		for (Deal deal : allDeals) {
			Calendar expiry=Calendar.getInstance();
			Calendar current=Calendar.getInstance();
			expiry.setTime(deal.getEndDate());
			if(current.getTime().before(expiry.getTime())){
				deals.add(deal);
				System.out.println("inside getdeals "+deal);
			}
		}
		
		return deals;
		
	}
}
