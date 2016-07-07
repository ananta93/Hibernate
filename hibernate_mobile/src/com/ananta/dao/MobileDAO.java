package com.ananta.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.ananta.dto.MobileDTO;

public class MobileDAO {
	public void save(MobileDTO dto){
		
		Configuration cfg=new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(MobileDTO.class);
		
		SessionFactory factory=cfg.buildSessionFactory();
		Session session=factory.openSession();
		session.save(dto);
		Transaction tx=session.beginTransaction();
		tx.commit();
		session.close();
		factory.close();
	}
}
