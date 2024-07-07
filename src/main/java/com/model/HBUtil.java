package com.model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class HBUtil {
	static StandardServiceRegistry sr;
	static SessionFactory sf;
	static Session session;
	public static SessionFactory getSessionFactory() {
		try {
			sr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
			MetadataSources ms = new MetadataSources(sr);
			Metadata md = ms.getMetadataBuilder().build();
			sf = md.getSessionFactoryBuilder().build();
			
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return sf; 
	}
	

}
