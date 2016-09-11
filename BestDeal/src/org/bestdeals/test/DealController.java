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
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Controller
public class DealController {

	@Autowired
	DealDao dealdao;
	
	@RequestMapping(value="/submitDeal", method = RequestMethod.POST)
	public String saveDeal(@RequestBody String jdeal){
		System.out.println("jdeal"+jdeal);
		ObjectMapper om=new ObjectMapper();
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
		}
		System.out.println("jdeal"+jdeal);
		dealdao.saveDeal(deal);
		System.out.println("Deal saved");
		return "RegisterDeal";	
	}
	
	@RequestMapping(value="/getDeal/{dealId}", method = RequestMethod.GET)
	public @ResponseBody String getDeal(@PathVariable("dealId") int dealId){
		ObjectMapper omapper=new ObjectMapper();
		//int dealID=Integer.parseInt(dealId);
		Deal deal=dealdao.getDeal(dealId);
		System.out.println("deal "+deal);
		String dealJson=null;
		try {
			dealJson = omapper.writeValueAsString(deal);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage()+" while converting into json "+deal.toString());
			e.printStackTrace();
		}
		return dealJson;
		
	}
	//Incomplete
	@RequestMapping(value="/getDealsAll", method = RequestMethod.GET)
	public String getDeals(){
		List<Deal> deals= dealdao.getDeals();
		System.out.println("deals"+ deals);
		ObjectMapper omapper=new ObjectMapper();
		try {
			String list=omapper.writeValueAsString(deals);
			System.out.println("delas in json"+ list);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "RegisterDeal";
		
	}
	
	
}
