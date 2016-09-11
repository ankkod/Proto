package org.bestdeals.test;

import java.io.IOException;
import java.util.List;
import org.bestdeals.dao.VoucherDao;
import org.bestdeals.model.Voucher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Controller
public class VoucherController {

	@Autowired
	VoucherDao voucherDao;
	
	@RequestMapping(value="/submitVoucher", method = RequestMethod.GET)
    public String saveVoucher(){
        return "";
    }
	
	@RequestMapping(value="/submitVoucher", method = RequestMethod.POST)
	public String saveVoucher(@RequestBody String jvoucher){
		System.out.println("jvoucher"+jvoucher);
		ObjectMapper om=new ObjectMapper();
		Voucher voucher=null;
		try {
			voucher = om.readValue(jvoucher.toString(),Voucher.class);
		} catch (JsonParseException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage()+" while parsing "+jvoucher.toString());
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage()+" while mapping "+jvoucher.toString());
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("jdeal"+jvoucher);
		voucherDao.saveVoucher(voucher);
		System.out.println("Voucher saved");
		return "";	
	}
	
	@RequestMapping(value="/getVoucher/{voucherId}", method = RequestMethod.GET)
	public @ResponseBody String getvoucher(@PathVariable("voucherId") int voucherId){
		ObjectMapper omapper=new ObjectMapper();
		Voucher voucher = voucherDao.getvoucher(voucherId);
		System.out.println("voucher "+voucher);
		String voucherJson=null;
		try {
			voucherJson = omapper.writeValueAsString(voucher);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage()+" while converting into json "+voucher.toString());
			e.printStackTrace();
		}
		return voucherJson;
		
	}

	
	@RequestMapping(value="/getVouchersAll", method = RequestMethod.GET)
	public String getVouchers(){
		List<Voucher> vouchers = voucherDao.getvouchers();
		System.out.println("vouchers"+ vouchers);
		ObjectMapper omapper=new ObjectMapper();
		try {
			String list=omapper.writeValueAsString(vouchers);
			System.out.println("vouchers in json"+ list);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "";	
	}
}
