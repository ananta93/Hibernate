package com.ananta.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.ananta.dto.GoogleDTO;
import com.ananta.util.HibernateSingleton;

public class GoogleDAO {
	
	public void update(int pk, String pname){
		Session session=HibernateSingleton.getFactory().openSession();
		GoogleDTO updateDB=session.get(GoogleDTO.class, pk);
		updateDB.setPname(pname);
		session.update(updateDB);
		Transaction tx=session.beginTransaction();
		tx.commit();
		session.close();
		
		updateDB.getState();
	}
	
}
