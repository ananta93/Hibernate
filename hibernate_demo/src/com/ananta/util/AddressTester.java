package com.ananta.util;

import com.ananta.dao.AddressDAO;

public class AddressTester {

	public static void main(String[] args) {

		/*AddressDTO addr=new AddressDTO();
		addr.setAid(1001);
		addr.setStreet("Marathahalli");
		addr.setCity("Bangalore");
		addr.setState("Karnataka");
		*/
		AddressDAO dao=new AddressDAO();
		dao.delete(1001);

	}
 
}
