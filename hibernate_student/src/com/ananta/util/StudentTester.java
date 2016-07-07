package com.ananta.util;

import com.ananta.dao.StudentDAO;
import com.ananta.dto.StudentDTO;

public class StudentTester {
	
	public static void main(String[] args){
		StudentDTO s=new StudentDTO();
		s.setSid(101);
		s.setSname("ananta");
		s.setSaddr("Bhubaneswar");
		s.setSbranch("CS");
		
		StudentDAO dao=new StudentDAO();
		dao.fetch(s, 101);
	}

}
