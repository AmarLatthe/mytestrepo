package com.xworkz.pharmacy.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "pharmacy")
public class PharmacyDTO implements Serializable {
	
	@Id
	@GenericGenerator(name = "om", strategy = "com.xworkz.pharmacy.dto.TestKeyGenerator")
	@GeneratedValue(generator = "om")
//	@Id
//	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "pharmacy_id")
	private int pharmacyId;
	@Column(name ="pharmacy_name")
	private String pharmacyName;
	@Column(name ="pharmacy_addr")
	private String pharmacyAddr;
	@Column(name ="pharmacy_state")
	private String pharmacyState;
	@Column(name ="pincode")
	private long pinCode;
	
	public int getPharmacyId() {
		return pharmacyId;
	}
	public void setPharmacyId(int pharmacyId) {
		this.pharmacyId = pharmacyId;
	}
	public String getPharmacyName() {
		return pharmacyName;
	}
	public void setPharmacyName(String pharmacyName) {
		this.pharmacyName = pharmacyName;
	}
	public String getPharmacyAddr() {
		return pharmacyAddr;
	}
	public void setPharmacyAddr(String pharmacyAddr) {
		this.pharmacyAddr = pharmacyAddr;
	}
	public String getPharmacyState() {
		return pharmacyState;
	}
	public void setPharmacyState(String pharmacyState) {
		this.pharmacyState = pharmacyState;
	}
	public long getPinCode() {
		return pinCode;
	}
	public void setPinCode(long pinCode) {
		this.pinCode = pinCode;
	}
	
	public PharmacyDTO() {
		
	}
}
