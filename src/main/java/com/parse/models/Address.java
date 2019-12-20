package com.parse.models;

/**
 * The Address model. It holds information of an Address.
 */
public class Address {

	private String street;
	private String housenumber;

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getHousenumber() {
		return housenumber;
	}

	public void setHousenumber(String housenumber) {
		this.housenumber = housenumber;
	}
}
