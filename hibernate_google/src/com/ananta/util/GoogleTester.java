package com.ananta.util;

import com.ananta.dao.GoogleDAO;

public class GoogleTester {

	public static void main(String[] args) {
				
		GoogleDAO dao=new GoogleDAO();
		dao.update(101,"youtube");

	}

}
