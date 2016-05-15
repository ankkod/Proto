package org.bestdeals.test;

import org.bestdeals.dao.DealDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.request.WebRequest;
@Controller
public class Test {
	@Autowired
	DealDao dealdao;
	
	@RequestMapping(value="/", method = RequestMethod.GET)
	
	public String test(){
		dealdao.saveDeal();
		System.out.println("Deal saved");
		return "index";
	}
	
	@RequestMapping(value="/submitDeal", method = RequestMethod.POST)
	public String submitDeal(Model model/*,Deal deal*/){
		
		return "";
	}
	
	
}
