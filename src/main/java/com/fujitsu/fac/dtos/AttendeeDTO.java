package com.fujitsu.fac.dtos;

import java.io.Serializable;

public class AttendeeDTO implements Serializable{

	private static final long serialVersionUID = -7044804573538784169L;

	private String firstName = "";
	private String lastName = "";
	private String email = "";
	private String companyName = "";
	private String position = "";
	private String phoneNumber = "";
	private String mobileNumber = "";
	private String role = "";
	
	public AttendeeDTO() {
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
	
	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();

		sb.append("firstName: ");
		sb.append(firstName);

		sb.append(" | lastName: ");
		sb.append(lastName);

		sb.append(" | email: ");
		sb.append(email);

		sb.append(" | companyName: ");
		sb.append(companyName);

		sb.append(" | position: ");
		sb.append(position);

		sb.append(" | phoneNumber: ");
		sb.append(phoneNumber);

		sb.append(" | role: ");
		sb.append(role);

		return sb.toString();

	}
}
