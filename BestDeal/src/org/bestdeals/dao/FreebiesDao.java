package org.bestdeals.dao;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.bestdeals.model.Freebies;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.bestdeals.service.DaoService;

public class FreebiesDao {
	
	public static final Logger logger=Logger.getLogger(FreebiesDao.class.getName());
	
	public void saveFreebie(Freebies freebie){
			
	//		Configuration co
			
			Session session=DaoService.getSession();
			Transaction transaction=session.getTransaction();
			transaction.begin();
			logger.log(Level.FINE, "new freebie", freebie.toString());
			session.save(freebie);
			
			session.flush();
			
			transaction.commit();
			session.close();
		}
	
	public Freebies getFreebies(int freebieId){
		Session session=DaoService.getSession();
		Freebies freebie=session.get(Freebies.class, freebieId);
		return freebie;
	}
	
	public List<Freebies> getFreebies(){
		Session session=DaoService.getSession();
		List<Freebies> allFreebies=session.createQuery("from freebies").list();
		List<Freebies> freebies=new ArrayList<Freebies>();
		for (Freebies freebie : allFreebies) {
			Calendar expiry=Calendar.getInstance();
			Calendar current=Calendar.getInstance();
			expiry.setTime(freebie.getEndDate());
			if(current.getTime().before(expiry.getTime())){
				freebies.add(freebie);
			}
		}
		
		return freebies;
		
	}

}
