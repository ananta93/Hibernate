package com.ananta.dao;

import java.io.Serializable;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.ananta.dto.MovieDTO;
import com.ananta.util.HibernateSingleton;

public class MovieDAO {
	public Integer save(MovieDTO movieDTO){
		Session session=HibernateSingleton.getFactory().openSession();
		Transaction tx=session.beginTransaction();
		Serializable pk=null;
		try{
			pk=session.save(movieDTO);
			System.out.println("PK is Generated \t"+pk);
			tx.commit();
		}
		catch(HibernateException he){
			he.printStackTrace();
			tx.rollback();
		}
		finally{
			session.close();
		}
		
		return (Integer) pk;
	}
}
