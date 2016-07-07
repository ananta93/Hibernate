package com.ananta.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateSingleton {
	
	public static SessionFactory factory;
	public static SessionFactory getFactory(){
		return factory;
	}
	static{
		Configuration cfg=new Configuration();
		cfg.configure();
		factory=cfg.buildSessionFactory();
	}

}
