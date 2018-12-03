package com.xworkz.pharmacy;

import com.xworkz.pharmacy.dao.PharmacyDAO;
import com.xworkz.pharmacy.dto.DogDTO;
import com.xworkz.pharmacy.dto.PharmacyDTO;

public class PharmacyTester {

	public static void main(String[] args) {
		
		PharmacyDTO dto = new PharmacyDTO();
		dto.setPharmacyName("Prime Care");
		dto.setPharmacyAddr("Ombr Layout");
		dto.setPharmacyState("KA");
		dto.setPinCode(560034);
		
		DogDTO dog = new DogDTO();
		//dog.setId(1);
		dog.setStr("Monkey");
		PharmacyDAO dao = new PharmacyDAO();
		dao.createPharmacy(dog);
		
	}
}
