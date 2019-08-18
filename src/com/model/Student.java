package com.model;

import java.util.LinkedHashMap;
import java.util.List;

public class Student 
{
	private String firstName;
	private String lastName;
	private String country;
	private LinkedHashMap<String, String> listOfCountries;
	private List<String> operatingSystems;
	private String language;
	
	public Student()
	{
		listOfCountries = new LinkedHashMap<String, String>();
		listOfCountries.put("IN", "India");
		listOfCountries.put("US", "USA");
		listOfCountries.put("BAN", "Bangladesh");
		listOfCountries.put("WI", "West Indies");
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public List<String> getOperatingSystems() {
		return operatingSystems;
	}
	public void setOperatingSystems(List<String> operatingSystems) {
		this.operatingSystems = operatingSystems;
	}
	public LinkedHashMap<String, String> getListOfCountries() {
		return listOfCountries;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}
	
	
}
