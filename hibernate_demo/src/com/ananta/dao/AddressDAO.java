package com.ananta.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import com.ananta.dto.AddressDTO;
import com.ananta.util.HibernateSingleton;

public class AddressDAO {

	/*public void save(AddressDTO dto){
		
		Configuration cfg=new Configuration();
		cfg.configure();
		SessionFactory factory=cfg.buildSessionFactory();
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		session.save(dto);
		tx.commit();
		session.close();
		*/
		
		public void delete(int pk){
			SessionFactory factory=HibernateSingleton.getFactory();
			Session session=factory.openSession();
			AddressDTO deleteDB=session.get(AddressDTO.class, pk);
			session.delete(deleteDB);
			Transaction tx=session.beginTransaction();
			tx.commit();
			session.close();
	
	
	}

}
