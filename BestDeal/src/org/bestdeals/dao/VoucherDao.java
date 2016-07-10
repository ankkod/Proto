package org.bestdeals.dao;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


import org.bestdeals.model.Voucher;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.bestdeals.service.DaoService;

public class VoucherDao {
	public static final Logger logger=Logger.getLogger(VoucherDao.class.getName());
public void saveVoucher(Voucher voucher){
		
//		Configuration co
		
		Session session=DaoService.getSession();
		Transaction transaction=session.getTransaction();
		transaction.begin();
		logger.log(Level.FINE, " new Voucher", voucher.toString());
		session.save(voucher);
		
		session.flush();
		
		transaction.commit();
		session.close();
	}

public Voucher getvoucher(int voucherId){
	Session session=DaoService.getSession();
	Voucher voucher=session.get(Voucher.class, voucherId);
	return voucher;
}

public List<Voucher> getvouchers(){
	Session session=DaoService.getSession();
	List<Voucher> allvouchers=session.createQuery("from voucher").list();
	List<Voucher> vouchers=new ArrayList<Voucher>();
	for (org.bestdeals.model.Voucher voucher : allvouchers) {
		Calendar expiry=Calendar.getInstance();
		Calendar current=Calendar.getInstance();
		expiry.setTime(voucher.getEndDate());
		if(current.getTime().before(expiry.getTime())){
			vouchers.add(voucher);
		}
	}
	
	return vouchers;	
}

}
