package org.bestdeals.test;

import java.util.List;

import org.bestdeals.dao.DealDao;
import org.bestdeals.model.Deal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DealController {

	@Autowired
	DealDao dealdao;
	
	@RequestMapping(value="/submitDeal", method = RequestMethod.POST)
	public String saveDeal(Deal deal){
		dealdao.saveDeal(deal);
		System.out.println("Deal saved");
		return "RegisterDeal";	
	}
	//Incomplete
	@RequestMapping(value="/getdeal/{dealId}", method = RequestMethod.GET)
	public void getDeal(@RequestParam("dealId") int dealId){
		Deal deal=dealdao.getDeal(dealId);
		return;
		
	}
	//Incomplete
	@RequestMapping(value="/getdeal", method = RequestMethod.GET)
	public String getDeals(){
		
		
		return "RegisterDeal";
		
	}
	
	
}
