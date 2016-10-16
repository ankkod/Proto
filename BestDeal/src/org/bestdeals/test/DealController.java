package org.bestdeals.test;

import java.io.IOException;
import java.util.List;

import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonArrayBuilder;
import javax.json.JsonReader;
import javax.servlet.http.HttpServletRequest;

import org.bestdeals.dao.DealDao;
import org.bestdeals.model.Deal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.servlet.mvc.support.*;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Controller
public class DealController {

	@Autowired
	DealDao dealdao;
	
	@RequestMapping(value="/submitDeal", method = RequestMethod.GET)
    public String saveDeal(){
        return "RegisterDeal";
    }
	
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
	public ModelAndView getDeals(){
		List<Deal> deals= dealdao.getDeals();
		System.out.println("deals"+ deals);
		ObjectMapper omapper=new ObjectMapper();
		try {
			String list=omapper.writeValueAsString(deals);
//			JsonFactory
			System.out.println("delas in json"+ list);
//			JsonArrayBuilder jsonreader=Json.createArrayBuilder();
//			jsonreader.add(list);
//			JsonArray jsonarr=jsonreader.build();
//			System.out.println("JSONARRAY "+jsonarr);
			//Json
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ModelAndView model = new ModelAndView("DisplayDeal");
		model.addObject("List", deals);

//		request.setAttribute("List", deals);
		return model;
		
	}
	
	
}
