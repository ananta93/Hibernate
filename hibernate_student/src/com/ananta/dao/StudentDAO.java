package com.ananta.dao;

import org.hibernate.Session;
import com.ananta.dto.StudentDTO;
import com.ananta.util.HibernateSingleton;

public class StudentDAO {

	/*public void save(StudentDTO dto){
		
		Session session=HibernateSingleton.getFactory().openSession();
		
		session.save(dto);
		Transaction tx=session.beginTransaction();
		tx.commit();
		session.close();
		
	}*/
	
	public void fetch(StudentDTO fromDB,int pk){
		Session session=HibernateSingleton.getFactory().openSession();
		fromDB=session.get(StudentDTO.class, pk);
		System.out.print(fromDB.getState());
	}
}
