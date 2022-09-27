package com.cricketer.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//Entity annotation to make sure that this class is entity class

@Entity
//Providing the table name in the database
@Table(name="cricketer")
public class CricketerDetails {
	
	//primary key is jersyNo
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private int jersyNo;
	private String name;
	private String role;
	private String dob;
	private String country;
	private String battingStyle;

	//Non-Parameterized Constructor
	public CricketerDetails() {
		
	}
		
	//Parameterized constructor
	public CricketerDetails(int jersyNo, String name, String role, String dob, String country, String battingStyle) {
		this.jersyNo = jersyNo;
		this.name = name;
		this.role = role;
		this.dob = dob;
		this.country = country;
		this.battingStyle = battingStyle;
	}
	
	//Setter-Getter methods
	public int getJersyNo() {
		return jersyNo;
	}

	public void setJersyNo(int jersyNo) {
		this.jersyNo = jersyNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getBattingStyle() {
		return battingStyle;
	}

	public void setBattingStyle(String battingStyle) {
		this.battingStyle = battingStyle;
	}

	//toString()
	@Override
	public String toString() {
		return "CricketerDetails [jersyNo=" + jersyNo + ", name=" + name + ", Role=" + role + ", dob=" + dob
				+ ", country=" + country + ", battingStyle=" + battingStyle + "]";
	}
	


}
