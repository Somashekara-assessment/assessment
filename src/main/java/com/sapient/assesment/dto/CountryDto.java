package com.sapient.assesment.dto;

public class CountryDto {
	
	private String country_id;
	
	private String country_name;
	

	public String getCountry_id() {
		return country_id;
	}

	public void setCountry_id(String country_id) {
		this.country_id = country_id;
	}

	public String getCountry_name() {
		return country_name;
	}

	public void setCountry_name(String country_name) {
		this.country_name = country_name;
	}

	@Override
	public String toString() {
		return "CountryDto [country_id=" + country_id + ", country_name=" + country_name + "]";
	}

}
