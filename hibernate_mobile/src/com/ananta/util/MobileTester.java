package com.ananta.util;

import com.ananta.dao.MobileDAO;
import com.ananta.dto.MobileDTO;

public class MobileTester {
	
	public static void main(String[] args){
		MobileDTO sony=new MobileDTO();
		sony.setCamera(5);
		sony.setM_id(101);
		sony.setModel_name("C2004");
		sony.setPrice(14999);
		sony.setRam(1);
		
		MobileDAO dao=new MobileDAO();
		dao.save(sony);
	}

}
