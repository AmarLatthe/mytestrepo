package com.xworkz.pharmacy.dao;

import java.awt.RadialGradientPaint;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.xworkz.pharmacy.dto.DogDTO;
import com.xworkz.pharmacy.dto.PharmacyDTO;

public class PharmacyDAO {

	private static SessionFactory factory;
	private static Session session;
	private Transaction tx;

	static {
		Configuration config = new Configuration();
		config.configure();
		config.addAnnotatedClass(DogDTO.class);
		factory = config.buildSessionFactory();
		session = factory.openSession();
	}

	public void createPharmacy(DogDTO pharmacyDTO) {

		tx = session.beginTransaction();
		session.save(pharmacyDTO);
		tx.commit();
		session.close();
		factory.close();
	}
	
	
}
