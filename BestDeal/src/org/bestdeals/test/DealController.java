package org.bestdeals.test;

import java.io.IOException;
import java.util.List;

import javax.json.Json;

import org.bestdeals.dao.DealDao;
import org.bestdeals.model.Deal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Controller
public class DealController {

	@Autowired
	DealDao dealdao;
	
	@RequestMapping(value="/submitDeal", method = RequestMethod.POST)
	public String saveDeal(@RequestBody Deal jdeal){
	/*	ObjectMapper om=new ObjectMapper();
		Deal deal=null;
		try {
			deal = om.readValue(jdeal.toString(),Deal.class);
		} catch (JsonParseException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage()+" while parsing "+jdeal.toString());
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage()+" while mapping "+jdeal.toString());
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		System.out.println("jdeal"+jdeal);
		dealdao.saveDeal(jdeal);
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
