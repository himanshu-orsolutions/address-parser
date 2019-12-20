package com.parse.models;

/**
 * The model Metadata. It holds the address metadata.
 */
public class Metadata {

	private Boolean isStreetFirst;
	private Integer precedence;

	/**
	 * Instantiating the metadata
	 * 
	 * @param isStreetFirst If the street comes first in the plain text
	 * @param precedence    The precendence of address
	 */
	public Metadata(Boolean isStreetFirst, Integer precedence) {

		this.isStreetFirst = isStreetFirst;
		this.precedence = precedence;
	}

	public Boolean getIsStreetFirst() {
		return isStreetFirst;
	}

	public void setIsStreetFirst(Boolean isStreetFirst) {
		this.isStreetFirst = isStreetFirst;
	}

	public Integer getPrecedence() {
		return precedence;
	}

	public void setPrecedence(Integer precedence) {
		this.precedence = precedence;
	}
}
