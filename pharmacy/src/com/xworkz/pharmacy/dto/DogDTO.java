package com.xworkz.pharmacy.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.GenericGenerators;

@Entity
@Table(name = "dogtable")
public class DogDTO implements Serializable {

	@Id
	@GenericGenerator(name = "dog", strategy = "increment")
	@GeneratedValue(generator = "dog")
	@Column(name = "iddogtable")
	private int id;
	@Column(name = "dogtablecol")
	private String str;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStr() {
		return str;
	}
	public void setStr(String str) {
		this.str = str;
	}
	
	
}
