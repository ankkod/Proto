package org.bestdeals.test;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.request.WebRequest;
@Controller
public class Test {

	@RequestMapping(value="/", method = RequestMethod.GET)
	
	public String test(){
		return "index";
	}
	
	@RequestMapping(value="/submitDeal", method = RequestMethod.POST)
	public String submitDeal(Model model/*,Deal deal*/){
		
		return "";
	}
	
	
}
