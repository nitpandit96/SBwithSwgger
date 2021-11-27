package com.csi.jpa;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Address {

	
	@Id
	@GeneratedValue
	
	private int addressId;
	
	private String addressStreet;
	
	private String addressCity;
	
	private String addressState;
	
	private String addressCountry;
	
	private long addressPinCode;

	public Address(String addressStreet, String addressCity, String addressState, String addressCountry,
			long addressPinCode) {
		super();
		this.addressStreet = addressStreet;
		this.addressCity = addressCity;
		this.addressState = addressState;
		this.addressCountry = addressCountry;
		this.addressPinCode = addressPinCode;
	}
	
	
}
