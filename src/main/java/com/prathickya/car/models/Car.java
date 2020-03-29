package com.prathickya.car.models;

import java.math.BigDecimal;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Car {
	
	//@Id
	//@GeneratedValue
	//private long id;
	
	private String name;
	
	private String email;
	
	private String phone;
	
	private String model;
	
	@Id
	private String sno;
	
	private BigDecimal purprice;;
	
	private Date purdate;
	
	private Boolean contact;
	
	//Empty constructor is required by JPA
	public Car () {
		
	}
	
	public Car(String name, String email, String phone, String model, String sno, BigDecimal purchasePrice,
			Date purchaseDate, Boolean contact) {
		super();
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.model = model;
		this.sno = sno;
		this.purprice = purchasePrice;
		this.purdate = purchaseDate;
		this.contact = contact;
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}
	

	/*
	 * public long getId() { return id; }
	 */

	public String getSno() {
		return sno;
	}

	public void setSno(String sno) {
		this.sno = sno;
	}

	public Boolean getContact() {
		return contact;
	}

	public void setContact(Boolean contact) {
		this.contact = contact;
	}
	
	

	public BigDecimal getPurprice() {
		return purprice;
	}

	public void setPurprice(BigDecimal purprice) {
		this.purprice = purprice;
	}

	public Date getPurdate() {
		return purdate;
	}

	public void setPurdate(Date purdate) {
		this.purdate = purdate;
	}

	@Override
	public String toString() {
		return "Car [name=" + name + ", email=" + email + ", phone=" + phone + ", model=" + model + ", serialNumber="
				+ sno + ", purchasePrice=" + purprice + ", purchaseDate=" + purdate + ", contact="
				+ contact + "]";
	}
	
	
	
}
